package com.javagda21.wzorce.creational.abstractfactory.zad2.bikepackage;

public abstract class BikeFactory {
    public static Bike stworz1OsobowegoKrossa5Przerzutek() {
        return new Bike("Kross", 1, 5, BikeType.BICYCLE);
    }

    public static Bike stworz1OsobowegoMerida6Przerzutek() {
        return new Bike("Merida", 1, 6, BikeType.BICYCLE);
    }

    public static Bike stworzTandemIniana3Przerzutki() {
        return new Bike("Iniana", 2, 3, BikeType.TANDEM);
    }
}
