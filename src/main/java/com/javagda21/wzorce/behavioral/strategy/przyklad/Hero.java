package com.javagda21.wzorce.behavioral.strategy.przyklad;

import com.javagda21.wzorce.behavioral.strategy.przyklad.strategies.*;

public class Hero {
    private String name;
    private IStrategy strategy;

    public Hero(String name) {
        this.name = name;
        this.strategy = new StrategySword();
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void fight(){
        // walka
//        System.out.println("Walczę mieczem");
//        System.out.println("Walczę łukiem");
        strategy.fight();
    }
}
