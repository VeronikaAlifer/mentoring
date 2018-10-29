package javaCore1.task1.entity;

public enum FruitType {

    APPLE(0.4, 0, 11.3, 46);

    private double proteins;
    private double fats;
    private double carbohydrates;
    private double calories;

    FruitType(double proteins, double fats, double carbohydrates, double calories) {
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

    @Override
    public String toString() {
        return "100g " + super.toString() + " contains:  proteins = " + proteins + "g" +
                        ", fats = " + fats + "g" +
                        ", carbohydrates = " + carbohydrates + "g" +
                        ", calories = " + calories + "kcal;";
    }
}
