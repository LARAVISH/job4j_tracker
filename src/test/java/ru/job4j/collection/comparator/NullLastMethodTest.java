package ru.job4j.collection.comparator;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class NullLastMethodTest {
    @Test
    public void test() {
        List<String> list = Arrays.asList("3", "2", "1", null);
        list.sort(NullLastMethod.nullLast());
        Assertions.assertEquals(Arrays.asList("1", "2", "3", null), list);
    }
}