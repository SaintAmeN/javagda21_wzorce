package com.javagda21.wzorce.structural.decorator.zad2;

import java.util.ArrayList;
import java.util.List;

public class CustomPizza implements IPizza {
    private List<String> additionalIngredients = new ArrayList<>();
    private SimplePizza simplePizza;

    public CustomPizza(SimplePizza simplePizza) {
        this.simplePizza = simplePizza;
    }

    public CustomPizza addIngredient(String ingredient) {
        additionalIngredients.add(ingredient);
        return this;
    }

    @Override
    public List<String> getIngredients() {
        List<String> ingredients = new ArrayList<>(additionalIngredients);
        ingredients.addAll(simplePizza.getIngredients());

        return ingredients;
    }

    @Override
    public double getPrice() {
        return simplePizza.getPrice() + additionalIngredients.size() * 2.5;
    }
}
