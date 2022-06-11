package ru.job4j.poly;

public class Bus implements Transport {

    private int passengersCount;

    @Override
    public void drive() {
        System.out.println("The bus is starting to run.");
    }

    @Override
    public void passengers(int number) {
        passengersCount += number;
    }

    @Override
    public float fillUp(float amountOfFuel) {
        float gasPrice = 4.986f;
        return amountOfFuel * gasPrice;
    }
}
