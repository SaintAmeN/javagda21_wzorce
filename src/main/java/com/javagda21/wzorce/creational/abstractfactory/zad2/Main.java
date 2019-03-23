package com.javagda21.wzorce.creational.abstractfactory.zad2;

import com.javagda21.wzorce.creational.abstractfactory.zad2.bikepackage.Bike;
import com.javagda21.wzorce.creational.abstractfactory.zad2.bikepackage.BikeFactory;

public class Main {
    public static void main(String[] args) {
        Bike b = BikeFactory.stworz1OsobowegoKrossa5Przerzutek();
//        Bike b3 = new Bike(); // nie działa.
    }
}
