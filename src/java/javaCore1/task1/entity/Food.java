package javaCore1.task1.entity;

public abstract class Food implements Comparable<Food> {

    private double proteins;
    private double fats;
    private double carbohydrates;
    private double calories;
    private double weight;

    public Food(int weight, double proteins, double fats, double carbohydrates, double calories) {
        this.weight = weight;
        this.proteins = calculate(weight, proteins);
        this.fats = calculate(weight, fats);
        this.carbohydrates = calculate(weight, carbohydrates);
        this.calories = calculate(weight, calories);

    }

    public Food() {

    }


    private double calculate(int weight, double nutritionalValue) {
        return weight * nutritionalValue / 100;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Food food = (Food) o;

        if (Double.compare(food.proteins, proteins) != 0) return false;
        if (Double.compare(food.fats, fats) != 0) return false;
        if (Double.compare(food.carbohydrates, carbohydrates) != 0) return false;
        if (Double.compare(food.calories, calories) != 0) return false;
        return Double.compare(food.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(proteins);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(fats);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(carbohydrates);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(calories);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return " weight= " + weight + "g" + ", proteins= " + proteins + "g" +
                ", fats= " + fats + "g" +
                ", carbohydrates= " + carbohydrates + "g" +
                ", calories= " + calories + "kcal;\n";
    }

    public double getProteins() {
        return proteins;
    }

    public void setProteins(double proteins) {
        this.proteins = proteins;
    }

    public double getFats() {
        return fats;
    }

    public void setFats(double fats) {
        this.fats = fats;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Food food) {
        return this.calories >= food.getCalories() ? 1 : -1;
    }
}