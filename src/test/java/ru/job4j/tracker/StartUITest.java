package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void whenAddOneItem() {
        String[] answers = {"coffee machine"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item result = tracker.findAll()[0];
        Item expected = new Item("coffee machine");
        assertEquals(expected.getName(), result.getName());
    }

    @Test
    public void whenAddSeveralItems() {
        String[] answers = {"coffee machine", "coffee beans", "soy milk"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        StartUI.createItem(input, tracker);
        StartUI.createItem(input, tracker);
        Item[] items = tracker.findAll();
        String[] result = {
                items[0].getName(), items[1].getName(), items[2].getName()
        };
        assertArrayEquals(answers, result);
    }
}
