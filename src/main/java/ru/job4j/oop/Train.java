package ru.job4j.oop;

public class Train implements Vehicle {

    private final String name;

    public Train(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.printf("The %s is moving on rails ", name);
        System.out.println("at the speed of 30 mph.");

    }

    @Override
    public void refuel() {
        System.out.printf("The %s needs diesel fuel to refuel.%s", name,
                System.lineSeparator());
    }
}
