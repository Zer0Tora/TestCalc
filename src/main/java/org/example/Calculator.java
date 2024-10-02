package org.example;

public class Calculator {
    public int summ(int a, int b) {;
        int sumResult = a + b;
        System.out.printf("Сумма %d и %d равна %d\n", a, b, sumResult);
        return sumResult;
    }

    public int diff(int a, int b) {;
        int diffResult = a - b;
        System.out.printf("Разность %d и %d равна %d\n", a, b, diffResult);
        return diffResult;
    }
}
