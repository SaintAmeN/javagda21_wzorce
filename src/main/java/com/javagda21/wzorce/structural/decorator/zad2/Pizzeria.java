package com.javagda21.wzorce.structural.decorator.zad2;

public abstract class Pizzeria {
    public static IPizza margharrita(){
        return new CustomPizza(new SimplePizza())
                .addIngredient("Oregano");
    }

    public static IPizza pineapple(){
        return new CustomPizza(new SimplePizza())
                .addIngredient("Pineapple")
                .addIngredient("Oregano");
    }
}
