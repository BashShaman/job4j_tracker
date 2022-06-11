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

    @Test
    public void whenEditItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("unedited item");
        tracker.add(item);
        String name = "edited item";
        String[] answers = {
                String.valueOf(item.getId()),
                name
        };
        StartUI.editItem(new StubInput(answers), tracker);
        Item editedItem = tracker.findById(item.getId());
        assertEquals(name, editedItem.getName());
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("to be deleted");
        tracker.add(item);
        String[] messages = {String.valueOf(item.getId())};
        StartUI.deleteItem(new StubInput(messages), tracker);
        Item foundItem = tracker.findById(item.getId());
        assertNull(foundItem);
    }
}
