package ru.job4j.oop;

public class PolyUsage {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[]{
                new Aircraft("MiG-21"),
                new Aircraft("Mitsubishi Zero"),
                new Train(" Eastern & Oriental Express"),
                new Train("Glacier Express"),
                new Bus("Ashok Leyland"),
                new Bus("Ikarus")
        };
        String hr = "-".repeat(55);
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            vehicle.refuel();
            System.out.println(hr);
        }
    }
}
