package com.kameswari;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kameswari.pojo.Car;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

import static com.kameswari.Utils.calculatePricePerDay;
import static com.kameswari.Utils.calculateProfit;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class ManageCarsTest {

    private ManageCars manageCars;

    @Before
    public void setup(){
        manageCars = new ManageCars();
        manageCars.setCarsDAO(mock(CarsDAO.class));
        when(manageCars.getCarsDAO().findAllCars()).thenReturn(testDataRecords());
    }

    @Test
    public void testFindAllByMakeAndColor() {
        String make = "tesla";
        String color = "blue";
        List<Car>  cars = manageCars.findAll(make,color);
        assertNotNull(cars);
        assertFalse(cars.isEmpty());
        cars.stream().forEach(e -> {
            if(!make.equalsIgnoreCase(e.getMake()) || !color.equalsIgnoreCase(e.getMetadata().getColor())){
                fail(String.format("Expected Make, Color %s %s -- Actual Make, Color %s %s",make,color,e.getMake(), e.getMetadata().getColor()));
            }
        });

    }

    @Test
    public void testDisplayBestProfit() {
        double bestProfit = 126417.81;
        List<Car>  cars = manageCars.displayAllBestProfitCar();
        assertNotNull(cars);
        assertFalse(cars.isEmpty());
        cars.stream().forEach(e -> {
            assertEquals(bestProfit,e.getProfit(),0);
        });

    }

    @Test
    public void testDisplayLowerPricePerDay() {
        int lowestPricePerDay=140;
        List<Car>  cars = manageCars.displayAllLowestPriceCars();
        assertNotNull(cars);
        assertFalse(cars.isEmpty());
        cars.stream().forEach(e -> {
            assertEquals(lowestPricePerDay,e.getPricePerDay());
        });
    }

    @Test
    public void testDisplayAllCars() {
        List<Car>  cars = manageCars.displayAllCars();
        assertNotNull(cars);
        assertFalse(cars.isEmpty());
    }

    private Car[] testDataRecords(){
        try {
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/test/resources/cars-sample-test.json"));
            Car[] cars = gson.fromJson(bufferedReader, Car[].class);
            Arrays.stream(cars).forEach(e -> {
                e.setProfit(calculateProfit(e));
                e.setPricePerDay(calculatePricePerDay(e));
            });
            return cars;
        } catch (Exception e) {
            throw  new RuntimeException("Test Data Exception",e);
        }
    }
}
