
package com.kameswari.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * The Metrics Schema
 * <p>
 * 
 * 
 */
public class Metrics {

    /**
     * The Yoymaintenancecost Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @SerializedName("yoymaintenancecost")
    @Expose
    private Double yoymaintenancecost = 0.0D;
    /**
     * The Depreciation Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @SerializedName("depreciation")
    @Expose
    private Double depreciation = 0.0D;
    /**
     * The Rentalcount Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @SerializedName("rentalcount")
    @Expose
    private Rentalcount rentalcount;

    /**
     * The Yoymaintenancecost Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Double getYoymaintenancecost() {
        return yoymaintenancecost;
    }

    /**
     * The Yoymaintenancecost Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setYoymaintenancecost(Double yoymaintenancecost) {
        this.yoymaintenancecost = yoymaintenancecost;
    }

    /**
     * The Depreciation Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Double getDepreciation() {
        return depreciation;
    }

    /**
     * The Depreciation Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setDepreciation(Double depreciation) {
        this.depreciation = depreciation;
    }

    /**
     * The Rentalcount Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Rentalcount getRentalcount() {
        return rentalcount;
    }

    /**
     * The Rentalcount Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setRentalcount(Rentalcount rentalcount) {
        this.rentalcount = rentalcount;
    }

    @Override
    public String toString() {
        return "Metrics{" +
                "yoymaintenancecost=" + yoymaintenancecost +
                ", depreciation=" + depreciation +
                ", rentalcount=" + rentalcount +
                '}';
    }
}
