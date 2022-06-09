package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            System.out.print("Select: ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Adding an item ===");
                System.out.print("Enter a name: ");
                Item item = new Item(scanner.nextLine());
                tracker.add(item);
                System.out.printf("The added item: %s.%s", item,
                        System.lineSeparator());
            } else if (select == 1) {
                System.out.println("=== Listing all items ===");
                Item[] items = tracker.findAll();
                if (items.length > 0) {
                    for (Item item : items) {
                        System.out.println(item);
                    }
                } else {
                    System.out.println("The storage has no items yet.");
                }
            } else if (select == 2) {
                System.out.println("=== Editing an item ===");
                System.out.print("Enter the ID to find: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter the name to set: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("The operation is successful.");
                } else {
                    System.out.print("The operation failed. ");
                    System.out.printf("There's NO item with the ID=%d.\n", id);
                }
            } else if (select == 3) {
                System.out.println("=== Deleting an item ===");
                System.out.print("Enter the ID of the item: ");
                int id = Integer.parseInt(scanner.nextLine());
                if (tracker.delete(id)) {
                    System.out.println("The operation is successful.");
                } else {
                    System.out.print("The operation failed. ");
                    System.out.printf("There's NO item with the ID=%d.\n", id);
                }
            } else if (select == 4) {
                System.out.println("=== Finding an item by ID ===");
                System.out.print("Enter the ID of the item: ");
                int id = Integer.parseInt(scanner.nextLine());
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item);
                } else {
                    System.out.print("The operation failed. ");
                    System.out.printf("There's NO item with the ID=%d.\n", id);
                }
            } else if (select == 5) {
                System.out.println("=== Listing items by name ===");
                System.out.print("Enter the name of the items: ");
                String name = scanner.nextLine();
                Item[] items = tracker.findByName(name);
                if (items.length > 0) {
                    for (Item item : items) {
                        System.out.println(item);
                    }
                } else {
                    System.out.printf("There are no items with the name=%s.\n",
                           name);
                }
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
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
