package com.javagda21.wzorce.structural.decorator;

public class HeroOnAHorse implements IHero {
    private Hero hero;

    private int horseHealth = 100;
    private int horseAdditionalAttackPoints = 50;

    public HeroOnAHorse(Hero hero) {
        this.hero = hero;
    }


    @Override
    public int getHealth() {
        return hero.getHealth() + horseHealth;
    }

    @Override
    public int getAttackPoints() {
        return hero.getAttackPoints() + horseAdditionalAttackPoints;
    }

    @Override
    public void takeAHit(int attackPoints) {
        if (horseHealth >= attackPoints) {
            horseHealth -= attackPoints;
        } else {
            int whatsLeft = attackPoints - horseHealth;
            horseHealth = 0;
            hero.takeAHit(whatsLeft);
        }
    }
}
