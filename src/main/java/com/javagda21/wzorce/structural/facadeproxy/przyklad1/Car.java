package com.javagda21.wzorce.structural.facadeproxy.przyklad1;

public class Car implements ICar{
    private String manufacturer;
    private String model;

    @Override
    public void turnOn() {
        warmUp();
        turnLightsOn();
        turnOnABS();
    }

    public void warmUp() {
        System.out.println("Warmup");
    }

    public void turnLightsOn() {
        System.out.println("Lights on");
    }

    public void turnLightsOff() {
        System.out.println("Lights off");
    }

    public void turnOnABS() {
        System.out.println("ABS");
    }
}
