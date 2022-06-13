package ru.job4j.tracker;

public interface UserAction {

    String getName();

    boolean execute(Input input, Tracker tracker);
}
