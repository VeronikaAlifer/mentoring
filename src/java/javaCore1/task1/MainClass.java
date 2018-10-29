package javaCore1.task1;

import javaCore1.task1.entity.*;
import javaCore1.task1.service.FoodService;
import javaCore1.task1.service.Print;

import java.util.LinkedList;
import java.util.List;

import static javaCore1.task1.entity.VegetableType.*;

public class MainClass {
    public static void main(String[] args) {
        FoodService foodService = new FoodService();
        List<Food> saladIngredients = new LinkedList<>();
        saladIngredients.add(new Vegetable(25, CABBAGE));
        saladIngredients.add(new Vegetable(33, CARROT));
        saladIngredients.add(new Vegetable(70, POTATO));
        saladIngredients.add(new Vegetable(33, ONION));
        saladIngredients.add(new Sauce(33, SauceType.MAYONNAISE));


        Salad salad = foodService.createSalad(saladIngredients);
        Borsch borsch = new Borsch(250);
        List<Object> lunch = new LinkedList<>();
        lunch.add(borsch);
        lunch.add(salad);

        System.out.println(foodService.calculatePfs(salad));
        Print.dishPfs(salad);
        Print.dishPfs(borsch);

        System.out.println(foodService.calculateCalories(borsch));
    }
}
