package ru.job4j.tracker;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.Matchers.nullValue;


public class StartUITest {

    @Test
    public void testCreateItem() {
        String[] answers = {"Update"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Update");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void testEditItem() {
        Tracker tracker = new Tracker();
        Item item = new Item();
        tracker.add(item);
        String[] answer = {String.valueOf(item.getId()), "replaced item"};
        StartUI.editItem(new StubInput(answer), tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("replaced item"));
    }
    @Test
    public void testDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item();
        tracker.add(item);
        String[] answer = {String.valueOf(item.getId()),"deleted item" };
        StartUI.deleteItem(new StubInput(answer),tracker);
        Item delete = tracker.findById(item.getId());
        assertThat(delete, is(nullValue()));

    }
}