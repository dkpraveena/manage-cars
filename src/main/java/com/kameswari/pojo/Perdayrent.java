
package com.kameswari.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * The Perdayrent Schema
 * <p>
 * 
 * 
 */
public class Perdayrent {

    /**
     * The Price Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @SerializedName("Price")
    @Expose
    private Integer price = 0;
    /**
     * The Discount Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @SerializedName("Discount")
    @Expose
    private Integer discount = 0;

    /**
     * The Price Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * The Price Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * The Discount Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public Integer getDiscount() {
        return discount;
    }

    /**
     * The Discount Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Perdayrent{" +
                "price=" + price +
                ", discount=" + discount +
                '}';
    }
}
