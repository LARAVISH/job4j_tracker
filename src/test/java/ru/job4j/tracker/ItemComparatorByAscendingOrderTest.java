package ru.job4j.tracker;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemComparatorByAscendingOrderTest {

@Test
    public void testCompare() {
    Tracker tracker = new Tracker();
    tracker.add(new Item(3,"item2"));
    tracker.add(new Item(23,"item1"));
    tracker.findAll().sort(new ItemComparatorByAscendingOrder());
    assertThat(tracker.findAll().get(0).getName(),is("item2"));
}

}