
package com.kameswari.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * The Root Schema
 * <p>
 * 
 * 
 */
public class Car {

    /**
     * The Make Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @SerializedName("make")
    @Expose
    private String make = "";
    /**
     * The Model Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @SerializedName("model")
    @Expose
    private String model = "";
    /**
     * The Vin Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @SerializedName("vin")
    @Expose
    private String vin = "";
    /**
     * The Metadata Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    /**
     * The Perdayrent Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @SerializedName("perdayrent")
    @Expose
    private Perdayrent perdayrent;
    /**
     * The Metrics Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @SerializedName("metrics")
    @Expose
    private Metrics metrics;

    private int pricePerDay;
    private double profit;

    /**
     * The Make Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getMake() {
        return make;
    }

    /**
     * The Make Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * The Model Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getModel() {
        return model;
    }

    /**
     * The Model Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * The Vin Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getVin() {
        return vin;
    }

    /**
     * The Vin Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setVin(String vin) {
        this.vin = vin;
    }

    /**
     * The Metadata Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * The Metadata Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    /**
     * The Perdayrent Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Perdayrent getPerdayrent() {
        return perdayrent;
    }

    /**
     * The Perdayrent Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setPerdayrent(Perdayrent perdayrent) {
        this.perdayrent = perdayrent;
    }

    /**
     * The Metrics Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Metrics getMetrics() {
        return metrics;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    /**
     * The Metrics Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setMetrics(Metrics metrics) {
        this.metrics = metrics;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", vin='" + vin + '\'' +
                ", metadata=" + metadata +
                ", perdayrent=" + perdayrent +
                ", metrics=" + metrics +
                ", pricePerDay=" + pricePerDay +
                ", profit=" + profit +
                '}';
    }
}
