package javaCore1.task1.entity;

public enum VegetableType  {

    CUCUMBER(0.8, 0, 3.0, 15),
    TOMATO(0.6, 0, 4.2, 19),
    CABBAGE(1.8, 0, 5.4, 28),
    CARROT(1.3, 0.1, 7.0, 15),
    ONION(1.7, 0, 9.5, 43),
    BEET(1.7, 0, 10.8, 48),
    POTATO(2.0, 0.1, 19.7, 83);

    private double proteins;
    private double fats;
    private double carbohydrates;
    private double calories;

    VegetableType(double proteins, double fats, double carbohydrates, double calories) {
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
        this.calories = calories;
    }

    public double getProteins() {
        return proteins;
    }

    public double getFats() {
        return fats;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public double getCalories() {
        return calories;
    }

}
