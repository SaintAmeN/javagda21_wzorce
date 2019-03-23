package com.javagda21.wzorce.behavioral.strategy.przyklad.strategies;

public class StrategySword implements IStrategy{
    @Override
    public void fight() {
        System.out.println("Walcze mjeczem! Ciach ciach!");
    }
}
