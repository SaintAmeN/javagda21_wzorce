package com.javagda21.wzorce.behavioral.strategy.przyklad.strategies;

public class StrategyRunAway implements IStrategy {
    @Override
    public void fight() {
        System.out.println("Uciekam!!!!");
    }
}
