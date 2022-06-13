package ru.job4j.tracker;

public class DeleteAction implements UserAction {

    @Override
    public String getName() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Deleting an item ===");
        int id = input.askInt("Enter the ID of the item: ");
        if (tracker.delete(id)) {
            System.out.println("The operation is successful.");
        } else {
            System.out.print("The operation failed. ");
            System.out.printf("There's NO item with the ID=%d.%s", id,
                    System.lineSeparator());
        }
        return true;
    }
}
