package ru.job4j.tracker;

public class ExitAction implements UserAction {

    @Override
    public String getName() {
        return "Exit Program";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}
