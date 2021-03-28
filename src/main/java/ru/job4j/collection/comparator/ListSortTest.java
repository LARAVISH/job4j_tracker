package ru.job4j.collection.comparator;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ListSortTest {
    @Test
    public void test(){
        List<String> input = Arrays.asList(null,"a","c","b");
        List<String> res = ListSort.sort(input);
        List<String> exp = Arrays.asList("c","b","a",null);
        Assert.assertEquals(exp, res);
    }
}
