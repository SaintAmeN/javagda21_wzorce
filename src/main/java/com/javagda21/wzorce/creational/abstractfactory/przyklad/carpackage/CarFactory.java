package com.javagda21.wzorce.creational.abstractfactory.przyklad.carpackage;

public abstract class CarFactory { // abstract factory

    public static Car createBMW1_6_Sport(){ // metoda factory
        return new Car("e36", "BMW", 100, 171);
    }

    public static Car createAudiA3(){ // metoda factory
        return new Car("A3", "Audi", 90, 160);
    }
}
