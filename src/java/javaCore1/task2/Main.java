package javaCore1.task2;

public class Main {

    public static void main(String[] args) {
        DynamicDoubleArray dynamicDoubleArrays = new DynamicDoubleArray(3);
        dynamicDoubleArrays.addFirst(12.0);
        dynamicDoubleArrays.addFirst(13.9);
        dynamicDoubleArrays.addFirst(12.22);
        dynamicDoubleArrays.addFirst(12.99);
        System.out.println(dynamicDoubleArrays);

        dynamicDoubleArrays.add(24.6, 2);
        System.out.println(dynamicDoubleArrays);

        dynamicDoubleArrays.addLast(77.99);
        System.out.println(dynamicDoubleArrays);

        dynamicDoubleArrays.remove(2);
        System.out.println(dynamicDoubleArrays);

        dynamicDoubleArrays.get(2);
        System.out.println(dynamicDoubleArrays.get(0));
    }
}
