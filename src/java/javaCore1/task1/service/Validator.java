package javaCore1.task1.service;

import javaCore1.task1.entity.Food;
import javaCore1.task1.entity.Fruit;
import javaCore1.task1.entity.Sauce;
import javaCore1.task1.entity.Vegetable;
import javaCore1.task1.exception.ChefErrorCode;
import javaCore1.task1.exception.ChefException;

import java.util.List;

public class Validator {

    public void validateSaladIngredient(List<Food> foods) {
        String foodName = null;

        for (Food food : foods) {
            if (food instanceof Vegetable || food instanceof Sauce) {
                continue;
            } else if (food instanceof Fruit) {
                foodName = ((Fruit) food).getFruitType().name();
            }
            String message = ChefErrorCode.INAPPROPRIATE_SALAD_FOOD.getErrorCode() + foodName;
            throw new ChefException(message);
        }
    }

    public void validateSaladSouse(List<Food> foods) {
        int count = 0;
        for (Food food : foods) {
            if (food instanceof Sauce) {
                count++;
            }
        }
        if (count != 1) {
            String message =ChefErrorCode.SALAD_SAUCE_EXCEPTION.getErrorCode();
            throw new ChefException(message);
        }
    }

}
