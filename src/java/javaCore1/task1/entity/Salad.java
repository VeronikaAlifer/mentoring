package javaCore1.task1.entity;

import java.util.List;

public class Salad extends Dish {

    private List<Food> ingredients;

    public Salad(List<Food> ingredients) {
        super(ingredients);
        this.ingredients = ingredients;
    }

    public List<Food> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Salad{" +
                "ingredients=" + ingredients;
    }


    private int calculateSaladWeigh(List<Food> ingredients) {
        this.ingredients = ingredients;
        return (int) ingredients.stream()
                .mapToDouble(Food::getWeight)
                .sum();
    }
}
