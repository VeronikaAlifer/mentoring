package javaCore1.task1.service;

import javaCore1.task1.entity.Dish;

import java.util.List;

public final class Print {

    public static void dishPfs(Dish dish) {
        FoodService foodService = new FoodService();
        List<String> parameters = foodService.calculatePfs(dish);
        System.out.println("PFS of " + dish.getClass().getSimpleName() + ":");
        for (int i = 0; i < parameters.size(); i++) {
            System.out.println("-"+ parameters.get(i));
        }
    }

}
