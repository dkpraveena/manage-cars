package com.kameswari;

import com.kameswari.pojo.Car;

import java.text.DecimalFormat;
import java.util.List;

public class Utils {

    public static DecimalFormat DECIMAL_FORMAT = new DecimalFormat(".##");

    public static void print(List<Car> cars) {
        if(cars == null || cars.isEmpty()){
            System.out.println("No Cars Found");
            return;
        }

        cars.stream().forEach(e -> System.out.println(e));

        System.out.println(" \n === End ===");

    }


    public static int calculatePricePerDay(Car car) {
        int discount =
                (car.getPerdayrent().getDiscount() / 100) * (car.getPerdayrent().getPrice());
        return car.getPerdayrent().getPrice()-discount;
    }

    public static double calculateProfit(Car car) {
        Double ytdExpense = (car.getMetrics().getYoymaintenancecost() + car.getMetrics().getDepreciation());
        int discount = (car.getPerdayrent().getDiscount() / 100) * car.getPerdayrent().getPrice();
        int pricePerDay = car.getPerdayrent().getPrice() - discount;
        int ytdRev = (car.getMetrics().getRentalcount().getYeartodate() * pricePerDay);
        return ytdRev - Double.parseDouble(DECIMAL_FORMAT.format(ytdExpense));
    }
}
