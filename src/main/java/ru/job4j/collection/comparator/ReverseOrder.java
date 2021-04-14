package ru.job4j.collection.comparator;

import java.util.Comparator;

public class ReverseOrder {
    public static Comparator<String> reverseOrder() {
        Comparator<String> comparator;
        comparator = Comparator.reverseOrder();
        return comparator;
    }
}
