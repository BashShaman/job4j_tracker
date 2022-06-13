package ru.job4j.tracker;

public class ListAllAction implements UserAction {

    @Override
    public String getName() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Listing all items ===");
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("The storage has no items yet.");
        }
        return true;
    }
}
