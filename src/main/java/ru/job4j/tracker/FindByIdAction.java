package ru.job4j.tracker;

public class FindByIdAction implements UserAction {

    @Override
    public String getName() {
        return "Find item by id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Finding an item by ID ===");
        int id = input.askInt("Enter the ID of the item: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.print("The operation failed. ");
            System.out.printf("There's NO item with the ID=%d.%s", id,
                    System.lineSeparator());
        }
        return true;
    }
}
