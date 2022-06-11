package ru.job4j.oop;

public class Bus implements Vehicle {

    private final String name;

    public Bus(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.printf("The %s is moving on the road ", name);
        System.out.println("at the speed of 60 km/h.");

    }

    @Override
    public void refuel() {
        System.out.printf("The %s needs gasoline to refuel.%s", name,
                System.lineSeparator());
    }
}
