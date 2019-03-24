package com.javagda21.wzorce.structural.decorator.zad2;

public class Main {
    public static void main(String[] args) {
        SimplePizza simplePizza = new SimplePizza();

        CustomPizza customPizza = new CustomPizza(simplePizza);
        customPizza
                .addIngredient("Majeranek")
                .addIngredient("Bekon")
                .addIngredient("Boczek")
                .addIngredient("Kurczak")
                .addIngredient("Ananas");

        System.out.println(customPizza.getIngredients());
        System.out.println(customPizza.getPrice());

//      Po zrobieniu fabryki (metod stworzeniowych)
        IPizza pizza = Pizzeria.margharrita();

        System.out.println(pizza.getIngredients());
        System.out.println(pizza.getPrice());
    }
}
