package ru.job4j.tracker;

public class ListByNameAction implements UserAction {

    @Override
    public String getName() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Listing items by name ===");
        String name = input.askStr("Enter the name of the items: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.printf("There are no items with the name=%s.%s",
                    name, System.lineSeparator());
        }
        return true;
    }
}
