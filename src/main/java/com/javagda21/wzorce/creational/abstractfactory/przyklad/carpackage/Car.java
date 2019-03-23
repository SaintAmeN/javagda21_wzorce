package com.javagda21.wzorce.creational.abstractfactory.przyklad.carpackage;

import lombok.Data;

@Data
public class Car {
    private String model;
    private String manufacturer;
    private int horsepower;
    private int maxSpeed;

    Car(String model, String manufacturer, int horsepower, int maxSpeed) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.horsepower = horsepower;
        this.maxSpeed = maxSpeed;
    }
}
