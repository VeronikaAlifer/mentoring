package javaCore1.task1.entity;

public class Sauce extends Food {

    private SauceType sauceType;

    public Sauce(int weight,SauceType sauceType) {
        super(weight, sauceType.getProteins(), sauceType.getFats(), sauceType.getCarbohydrates(), sauceType.getCalories());
        this.sauceType = sauceType;
    }


    public Sauce(SauceType sauceType) {
        super(100, sauceType.getProteins(), sauceType.getFats(), sauceType.getCarbohydrates(), sauceType.getCalories());;
        this.sauceType = sauceType;
    }

    @Override
    public String toString() {
        return sauceType.name().toLowerCase() + super.toString();
    }

    public SauceType getSauceType() {
        return sauceType;
    }
}
