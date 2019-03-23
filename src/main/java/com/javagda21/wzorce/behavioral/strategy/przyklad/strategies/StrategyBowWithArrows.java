package com.javagda21.wzorce.behavioral.strategy.przyklad.strategies;

import com.javagda21.wzorce.behavioral.strategy.przyklad.strategies.*;

public class StrategyBowWithArrows implements IStrategy {
    @Override
    public void fight() {
        System.out.println("Walczę szczałami! pew , pew");
    }
}
