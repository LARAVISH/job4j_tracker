package ru.job4j.collection.comparator;

import java.util.Comparator;
import java.util.List;

public class CollectionsSort {
    public static List<String> sort(List<String> data) {
        Comparator<String> comparator;
        comparator = Comparator.naturalOrder();
        data.sort(comparator);
        return data;
    }
}
