package ru.job4j.inheritance;

public class PizzaExtraCheese extends Pizza {
    private static final String SUPPLEMENT = "extra cheese";

    public String name() {
        return String.format("%s + %s", super.name(), SUPPLEMENT);
    }
}
