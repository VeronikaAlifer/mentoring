package javaCore1.task1.service;

import javaCore1.task1.entity.*;

import java.util.ArrayList;
import java.util.List;

public class FoodService {

    private Validator validator = new Validator();

    public Salad createSalad(List<Food> foods) {
        validator.validateSaladIngredient(foods);
        validator.validateSaladSouse(foods);
        return new Salad(foods);
    }

    public double calculateMealCalories(Borsch borsch, Salad salad) {
        double saladCalories = calculateCalories(salad);
        double borschCalories = calculateCalories(borsch);

        return saladCalories + borschCalories;
    }

    public double calculateCalories(Dish dish) {
        return dish.getIngredients().stream()
                .mapToDouble(Food::getCalories)
                .sum();
    }

    public void createLunch(List<Food> lunch) {

    }

    public void calculatLunchPfs() {

    }

    public List<String> calculatePfs(Dish dish) {
        List<String> dishPfs = new ArrayList<>();

        String weigh = String.valueOf(dish.getIngredients().stream()
                .mapToDouble(Food::getWeight).sum());
        String proteins = String.valueOf(dish.getIngredients().stream()
                .mapToDouble(Food::getProteins).sum());

        String fat = String.valueOf(dish.getIngredients().stream()
                .mapToDouble(Food::getFats)
                .sum());

        String carbohydrates = String.valueOf(dish.getIngredients().stream()
                .mapToDouble(Food::getCarbohydrates)
                .sum());

        String calories = String.valueOf(dish.getIngredients().stream()
                .mapToDouble(Food::getCalories)
                .sum());

        dishPfs.add("weigh " + weigh);
        dishPfs.add("proteins "+proteins);
        dishPfs.add("fat "+fat);
        dishPfs.add("carbohydrates "+carbohydrates);
        dishPfs.add("calories "+calories);
        return dishPfs;
    }
}
