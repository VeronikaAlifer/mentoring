package javaCore1.task1.entity;

import java.util.List;

public abstract class Dish extends Food {

    private List<Food> ingredients;

    public Dish(List<Food> ingredients) {
        this.ingredients = ingredients;
    }

    public Dish() {}

    public List<Food> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Food> ingredients) {
        this.ingredients = ingredients;
    }
}
