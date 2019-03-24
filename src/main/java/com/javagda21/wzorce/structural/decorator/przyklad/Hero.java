package com.javagda21.wzorce.structural.decorator.przyklad;

import lombok.Data;

@Data
public final class Hero implements IHero{
    private String name;
    private int health;
    private int attackPoints;

    public Hero(String name, int health, int attackPoints) {
        this.name = name;
        this.health = health;
        this.attackPoints = attackPoints;
    }

    public void attack(IHero hero) {
        hero.takeAHit(getAttackPoints());
    }

    @Override
    public void takeAHit(int attackPoints) {
        health -=attackPoints;
    }
}
