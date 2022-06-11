package ru.job4j.oop;

public class Aircraft implements Vehicle {

    private final String name;

    public Aircraft(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.printf("The %s is flying at 36000 feet high.%s", name,
                System.lineSeparator());
    }

    @Override
    public void refuel() {
        System.out.printf("The %s needs aviation fuel to refuel.%s", name,
                System.lineSeparator());
    }
}
