package ru.job4j.tracker;

public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Adding an item ===");
        Item item = new Item(input.askStr("Enter a name: "));
        tracker.add(item);
        System.out.printf("The added item: %s.%s", item,
                System.lineSeparator());
    }

    public static void listItems(Input input, Tracker tracker) {
        System.out.println("=== Listing all items ===");
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("The storage has no items yet.");
        }
    }

    public static void editItem(Input input, Tracker tracker) {
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
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Deleting an item ===");
        int id = input.askInt("Enter the ID of the item: ");
        if (tracker.delete(id)) {
            System.out.println("The operation is successful.");
        } else {
            System.out.print("The operation failed. ");
            System.out.printf("There's NO item with the ID=%d.%s", id,
                    System.lineSeparator());
        }
    }

    public static void findItemById(Input input, Tracker tracker) {
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
    }

    public static void listItemsByName(Input input, Tracker tracker) {
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
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                createItem(input, tracker);
            } else if (select == 1) {
                listItems(input, tracker);
            } else if (select == 2) {
                editItem(input, tracker);
            } else if (select == 3) {
                deleteItem(input, tracker);
            } else if (select == 4) {
                findItemById(input, tracker);
            } else if (select == 5) {
                listItemsByName(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        String[] menu = {
                "Add new Item", "Show all items", "Edit item",
                "Delete item", "Find item by id", "Find items by name",
                "Exit Program"
        };
        System.out.println("Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%d. %s\n", i, menu[i]);
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
