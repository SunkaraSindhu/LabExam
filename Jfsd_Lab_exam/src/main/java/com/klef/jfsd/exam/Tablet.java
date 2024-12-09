package com.klef.jfsd.exam;

import javax.persistence.*;

@Entity
@Table(name = "Tablet")
public class Tablet extends Device {
    @Column(nullable = false)
    private double screenSize;

    @Column(nullable = false)
    private int batteryLife;

    // Getters and Setters
    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }
}
