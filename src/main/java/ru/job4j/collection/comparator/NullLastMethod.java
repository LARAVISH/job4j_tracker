package ru.job4j.collection.comparator;

import java.util.Comparator;

public class NullLastMethod {


    public static Comparator<String> nullLast() {
        Comparator<String> comparator;
        comparator = Comparator.nullsLast(Comparator.naturalOrder());
        return comparator;
    }
}
