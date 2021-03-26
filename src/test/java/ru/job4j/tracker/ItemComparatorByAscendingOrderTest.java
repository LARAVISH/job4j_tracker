package ru.job4j.tracker;


import org.junit.Test;
import java.util.Collections;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemComparatorByAscendingOrderTest {

@Test
    public void testCompare() {
    Tracker tracker = new Tracker();
    tracker.add(new Item(3,"item2"));
    tracker.add(new Item(23,"item1"));
    Collections.sort(tracker.findAll(),new ItemComparatorByAscendingOrder());
    assertThat(tracker.findAll().get(0).getName(),is("item2"));
}

}