
package com.kameswari.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * The Rentalcount Schema
 * <p>
 * 
 * 
 */
public class Rentalcount {

    /**
     * The Lastweek Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @SerializedName("lastweek")
    @Expose
    private Integer lastweek = 0;
    /**
     * The Yeartodate Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @SerializedName("yeartodate")
    @Expose
    private Integer yeartodate = 0;

    /**
     * The Lastweek Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Integer getLastweek() {
        return lastweek;
    }

    /**
     * The Lastweek Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setLastweek(Integer lastweek) {
        this.lastweek = lastweek;
    }

    /**
     * The Yeartodate Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Integer getYeartodate() {
        return yeartodate;
    }

    /**
     * The Yeartodate Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setYeartodate(Integer yeartodate) {
        this.yeartodate = yeartodate;
    }

    @Override
    public String toString() {
        return "Rentalcount{" +
                "lastweek=" + lastweek +
                ", yeartodate=" + yeartodate +
                '}';
    }
}
