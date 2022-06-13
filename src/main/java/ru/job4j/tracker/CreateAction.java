package ru.job4j.tracker;

public class CreateAction implements UserAction {

    @Override
    public String getName() {
        return "Add new Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Adding an item ===");
        Item item = new Item(input.askStr("Enter a name: "));
        tracker.add(item);
        System.out.printf("The added item: %s.%s", item,
                System.lineSeparator());
        return true;
    }
}
