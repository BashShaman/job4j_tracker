package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    private static final String SUPPLEMENT = "extra tomato";

    public String name() {
        return String.format("%s + %s", super.name(), SUPPLEMENT);
    }
}
