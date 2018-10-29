package javaCore1.task1.entity;

public class Vegetable extends Food {

    private VegetableType vegetableType;

    public Vegetable(int weight, VegetableType vegetableType) {
        super(weight, vegetableType.getProteins(), vegetableType.getFats(), vegetableType.getCarbohydrates(), vegetableType.getCalories());
        this.vegetableType = vegetableType;
    }

    public Vegetable(VegetableType vegetableType) {
        super(100, vegetableType.getProteins(), vegetableType.getFats(), vegetableType.getCarbohydrates(), vegetableType.getCalories());
        this.vegetableType = vegetableType;
    }

    @Override
    public String toString() {
        return vegetableType.name().toUpperCase() + super.toString();
    }
}
