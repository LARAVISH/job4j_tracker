package ru.job4j.collection.comparator;

import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.assertEquals;

public class ReverseOrderTest {

    @Test
    public void test() {
        assertEquals(Comparator.reverseOrder(), ReverseOrder.reverseOrder());
    }

}