package com.kameswari;

import static com.kameswari.Utils.print;

public class MyClient {

    public static void main(String[] args) {

        ManageCars manageCar = new ManageCars();
        print(manageCar.findAll("tesla","blue"));
        print(manageCar.displayAllLowestPriceCars());
        print(manageCar.displayAllBestProfitCar());
        print(manageCar.displayAllCars());
    }

}
