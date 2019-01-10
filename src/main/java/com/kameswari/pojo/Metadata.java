
package com.kameswari.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * The Metadata Schema
 * <p>
 * 
 * 
 */
public class Metadata {

    /**
     * The Color Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @SerializedName("Color")
    @Expose
    private String color = "";
    /**
     * The Notes Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @SerializedName("Notes")
    @Expose
    private String notes = "";

    /**
     * The Color Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getColor() {
        return color;
    }

    /**
     * The Color Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * The Notes Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public String getNotes() {
        return notes;
    }

    /**
     * The Notes Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Metadata{" +
                "color='" + color + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
