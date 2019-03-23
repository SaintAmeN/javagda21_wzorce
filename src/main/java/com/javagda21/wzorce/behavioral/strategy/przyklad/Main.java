package com.javagda21.wzorce.behavioral.strategy.przyklad;

import com.javagda21.wzorce.behavioral.strategy.przyklad.strategies.*;
public class Main {
    public static void main(String[] args) {
        Hero hero= new Hero("Marian");
        hero.setStrategy(new StrategyBowWithArrows());

        hero.fight();

        hero.setStrategy(new StrategySword());
        hero.fight();

        hero.setStrategy(new StrategyRunAway());
        hero.fight();
    }
}
