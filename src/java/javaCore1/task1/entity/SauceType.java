package javaCore1.task1.entity;

public enum SauceType {

    OIL(0.4, 0, 11.3, 46),
    MAYONNAISE(33,17,66,243),
    KETCHUP(1.25,0.18,26.23,112);

    private double proteins;
    private double fats;
    private double carbohydrates;
    private double calories;

    SauceType(double proteins, double fats, double carbohydrates, double calories) {
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
