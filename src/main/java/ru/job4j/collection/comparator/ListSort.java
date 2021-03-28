package ru.job4j.collection.comparator;

import java.util.Comparator;
import java.util.List;

public class ListSort {
    public static List<String> sort(List<String> data) {
        Comparator<String> comparator ;
        comparator = Comparator.nullsLast(Comparator.reverseOrder());
        data.sort(comparator);
        return data;
    }
}
