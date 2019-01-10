package com.kameswari;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kameswari.pojo.Car;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.kameswari.Constants.*;
import static com.kameswari.Utils.*;

/**
 * Manage Car Class
 */
public class ManageCar {

    Car[] cars = null;

    /**
     * @param carMake
     * @param color
     * @return
     */
    public List<Car> findCar(String carMake, String color) {

        System.out.println(String.format("\n === finding cars.. %s %s ===\n", carMake, color));
        loadCarsData();

        return Arrays.stream(cars)
                .filter(car -> carMake.equalsIgnoreCase(car.getMake()) &&
                        color.equalsIgnoreCase(car.getMetadata().getColor()))
                .collect(Collectors.toList());
    }

    /**
     *
     * @return
     */
    public List<Car> displayAllLowestPriceCars() {

        System.out.println(" \n === displaying lower price per day cars === \n");
        loadCarsData();

        //calculate lowest Price Per Day Car
        int lowestPricePerDay = calculateLowerPricePerDay();

        // Find all cars matching the lower price per day
        return Arrays.stream(cars)
                .filter(car -> lowestPricePerDay == car.getPricePerDay())
                .collect(Collectors.toList());
    }

    /**
     *
     * @return
     */
    public List<Car> displayAllBestProfitCar() {

        System.out.println(" \n === displaying best profit cars === \n");
        loadCarsData();

        // Calculate the best profit out of all cars
        double profit = calculateBestProfit();

        // Find all cars matching the best profit
        return Arrays.stream(cars)
                .filter(car -> profit == car.getProfit())
                .collect(Collectors.toList());
    }

    /**
     *
     * @return
     */
    public double calculateBestProfit() {
        double profit = Double.MIN_VALUE;
        for (Car car : cars) {
            profit = Math.max(profit, car.getProfit());
        }
        return profit;
    }


    private int calculateLowerPricePerDay() {
        int lowestPricePerDay = Integer.MAX_VALUE;
        for (Car car : cars) {
            lowestPricePerDay = Math.min(car.getPricePerDay(), lowestPricePerDay);
        }
        return lowestPricePerDay;

    }

    /**
     * Load Test Data
     */
    public void loadCarsData() {
        if (cars != null) {
            return;
        }

        try {
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_NAME_CARS_SAMPLE_DATA));
            this.cars = gson.fromJson(bufferedReader, Car[].class);
            Arrays.stream(cars).forEach(e -> {
                e.setProfit(calculateProfit(e));
                e.setPricePerDay(calculatePricePerDay(e));
            });

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(String.format("Test Data File Not Found %s", FILE_NAME_CARS_SAMPLE_DATA));
        }
    }

    /**
     * Reload Test Data
     */
    public void reloadCarsData() {
        cars = null;
        loadCarsData();
    }
}
