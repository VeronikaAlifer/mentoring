package javaCore1.task1.entity;

import java.util.Arrays;
import java.util.List;

import static javaCore1.task1.entity.SauceType.KETCHUP;
import static javaCore1.task1.entity.SauceType.OIL;
import static javaCore1.task1.entity.VegetableType.*;

public class Borsch extends Dish{
    private List<Food> ingredients;

    public Borsch() {
        this(4000);
    }

    public Borsch(int portionWeight) {
        super();
        Vegetable cabbage = new Vegetable(300 * portionWeight / 4000, CABBAGE);
        Vegetable potato = new Vegetable(300 * portionWeight / 4000, POTATO);
        Vegetable beet = new Vegetable(150 * portionWeight / 4000, BEET);
        Vegetable carrot = new Vegetable(100 * portionWeight / 4000, CARROT);
        Vegetable onion = new Vegetable(100 * portionWeight / 4000, ONION);
        Sauce ketchup = new Sauce(25 * portionWeight / 4000, KETCHUP);
        Sauce oil = new Sauce(25 * portionWeight / 4000, OIL);
        Water water = new Water(3000 * portionWeight / 4000);
        ingredients = Arrays.asList(cabbage, potato, beet, carrot, onion, ketchup, oil, water);
    }

    public List<Food> getIngredients() {
        return ingredients;
    }
}
