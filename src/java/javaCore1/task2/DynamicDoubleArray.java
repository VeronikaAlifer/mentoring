package javaCore1.task2;

import java.util.Arrays;

public class DynamicDoubleArray {
    private Double[] doubles = {};
    private Double[] length;

    public DynamicDoubleArray(int length) {
        this.length = new Double[length];
    }

    public DynamicDoubleArray() {
        this.length = doubles;
    }

    public Double get(int index) {
        if (index < 0 || index >= doubles.length) {
            throw new IllegalArgumentException();
        }

        return doubles[index];
    }

    public void addFirst(Double param) {
        if (param == null) {
            throw new IllegalArgumentException();
        }

        Double[] newDoubles = new Double[doubles.length + 1];
        newDoubles[0] = param;

        for (int i = 0; i < doubles.length; i++) {
            newDoubles[i + 1] = doubles[i];
        }
        doubles = newDoubles;
    }

    public void addLast(Double param) {
        if (param == null) {
            throw new IllegalArgumentException();
        }

        Double[] newDoubles = new Double[doubles.length + 1];
        newDoubles[doubles.length] = param;

        for (int i = 0; i < doubles.length; i++) {
            newDoubles[i] = doubles[i];
        }
        doubles = newDoubles;
    }

    public void add(Double param, int index) {

        if (param == null || index < 0 || index >= doubles.length) {
            throw new IllegalArgumentException();
        }

        Double[] newDoubles = new Double[doubles.length + 1];
        newDoubles[index] = param;

        for (int i = 0; i < index; i++) {
            newDoubles[i] = doubles[i];
        }

        for (int i = index + 1; i < newDoubles.length; i++) {
            newDoubles[i] = doubles[i - 1];
        }
        doubles = newDoubles;
    }

    public void remove(int index) {
        if (index < 0 || index >= doubles.length) {
            throw new IllegalArgumentException();
        }
        Double[] newDoubles = new Double[doubles.length - 1];

        for (int i = index; i < doubles.length - 1; i++) {
            doubles[i] = doubles[i + 1];
        }

        for (int i = 0; i < newDoubles.length; i++) {
            newDoubles[i] = doubles[i];
        }
        doubles = newDoubles;
    }

    @Override
    public String toString() {
        return "DynamicDoubleArray{" +
                Arrays.toString(doubles) +
                '}';
    }
}
