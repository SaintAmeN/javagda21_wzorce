package com.javagda21.wzorce.creational.abstractfactory;

import com.javagda21.wzorce.creational.abstractfactory.carpackage.Car;
import com.javagda21.wzorce.creational.abstractfactory.carpackage.CarFactory;

public class Main {
    public static void main(String[] args) {
        Car samochodAudi = CarFactory.createAudiA3();

        Bicycle bicycle = Bicycle.stworz8BiegowegoKross();
        Bicycle bicycle2 = new Bicycle();
    }
}
