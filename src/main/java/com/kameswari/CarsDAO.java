package com.kameswari;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kameswari.pojo.Car;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

import static com.kameswari.Constants.FILE_NAME_CARS_SAMPLE_DATA;
import static com.kameswari.Utils.calculatePricePerDay;
import static com.kameswari.Utils.calculateProfit;

public class CarsDAO {

    /**
     * Load Test Data
     */
    public Car[] findAllCars() {
        try {
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_NAME_CARS_SAMPLE_DATA));
            Car[] cars = gson.fromJson(bufferedReader, Car[].class);
            Arrays.stream(cars).forEach(e -> {
                e.setProfit(calculateProfit(e));
                e.setPricePerDay(calculatePricePerDay(e));
            });
            return cars;
        } catch (Exception e) {
            throw new RuntimeException(String.format("Test Data File Not Found %s", FILE_NAME_CARS_SAMPLE_DATA),e);
        }
    }
}
