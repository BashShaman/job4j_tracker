package ru.job4j.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            int select = input.askInt("Select: ");
            run = actions[select].execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu:");
        for (int i = 0; i < actions.length; i++) {
            System.out.printf("%d. %s\n", i, actions[i].getName());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new ListAllAction(),
                new EditAction(),
                new DeleteAction(),
                new FindByIdAction(),
                new ListByNameAction(),
                new ExitAction()
        };
        new StartUI().init(input, tracker, actions);
    }
}
