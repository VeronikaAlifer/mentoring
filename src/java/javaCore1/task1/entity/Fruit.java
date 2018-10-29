package javaCore1.task1.entity;

public class Fruit extends Food {

    private FruitType fruitType;

    public Fruit(int weight, FruitType fruitType) {
        super(weight, fruitType.getProteins(), fruitType.getFats(), fruitType.getCarbohydrates(), fruitType.getCalories());
        this.fruitType = fruitType;
    }

    public Fruit(FruitType fruitType) {
        super(100, fruitType.getProteins(), fruitType.getFats(), fruitType.getCarbohydrates(), fruitType.getCalories());
        this.fruitType = fruitType;
    }
    @Override
    public String toString() {
        return fruitType.name().toLowerCase() + super.toString();
    }

    public FruitType getFruitType() {
        return fruitType;
    }
}
