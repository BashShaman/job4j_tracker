package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int multiply(int a) {
        return x * a;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y  / x;
    }

    public static int getX() {
        return x;
    }

    public int sumAllOperations(int y) {
        return sum(y) + multiply(y) + minus(y) + divide(y);
    }

    public static void main(String[] args) {
        int y = 12;
        System.out.printf("%d + %d = %d\n", y, Calculator.getX(),
                Calculator.sum(y));
        System.out.printf("%d * %d = %d\n", y, Calculator.getX(),
                Calculator.multiply(y));
        System.out.printf("%d - %d = %d\n", y, Calculator.getX(),
                Calculator.minus(y));
        Calculator calc = new Calculator();
        System.out.printf("%d / %d = %d\n", y, Calculator.getX(),
                calc.divide(y));
        System.out.printf("%s.sumAllOperations(%d) = %d\n", "calc", y,
                calc.sumAllOperations(y));
    }
}
