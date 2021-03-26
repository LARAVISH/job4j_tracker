package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemComparatorByDescendingOrderTest  {
    @Test
    public void testCompare() {
        Tracker tracker = new Tracker();
        tracker.add(new Item(0,"item1"));
        tracker.add(new Item(3,"item"));
        tracker.findAll().sort(new ItemComparatorByDescendingOrder());
        assertThat(tracker.findAll().get(0).getName(),is("item"));
    }
}