package ru.job4j.tracker;

public class EditAction implements UserAction {

    @Override
    public String getName() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Editing an item ===");
        int id = input.askInt("Enter the ID to find: ");
        String name = input.askStr("Enter the name to set: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("The operation is successful.");
        } else {
            System.out.print("The operation failed. ");
            System.out.printf("There's NO item with the ID=%d.%s", id,
                    System.lineSeparator());
        }
        return true;
    }
}
