package com.javagda21.wzorce.structural.decorator.przyklad;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Marian", 100, 30);

        System.out.println(hero);
        System.out.println(hero.getAttackPoints());

        HeroOnAHorse heroOnAHorse = new HeroOnAHorse(hero);
        System.out.println(heroOnAHorse.getAttackPoints());
    }
}
