package ru.job4j.collection.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortWithObject {
    public static String[] sort(String[] data) {
        Comparator<String> comparator;
        comparator = Comparator.reverseOrder();
         Arrays.sort(data, comparator);
         return data;
    }
}
