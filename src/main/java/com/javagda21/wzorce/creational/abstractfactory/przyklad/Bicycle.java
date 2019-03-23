package com.javagda21.wzorce.creational.abstractfactory.przyklad;

public class Bicycle {
    private String manufacturer;
    private int gears;

    private Bicycle(String manufacturer, int gears) {
        this.manufacturer = manufacturer;
        this.gears = gears;
    }

    // metoda factory (bo nie jest w klasie factory)
    public static Bicycle stworz8BiegowegoKross(){
        return new Bicycle("Kross", 8);
    }
}
