package com.kameswari;

import java.text.DecimalFormat;

import static com.kameswari.Utils.print;

public class MyClient {

    public static void main(String[] args) {

        ManageCar manageCar = new ManageCar();
        print(manageCar.findCar("tesla","blue"));
        print(manageCar.displayAllLowestPriceCars());
        print(manageCar.displayAllBestProfitCar());
    }

}
