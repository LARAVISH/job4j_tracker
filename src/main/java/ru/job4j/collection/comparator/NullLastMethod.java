package ru.job4j.collection.comparator;

import java.util.Comparator;

public class NullLastMethod {


    public static Comparator<String> nullLast() {
        Comparator<String> comparator = (o1, o2) -> o1.compareTo(o2);
        comparator = Comparator.nullsLast(Comparator.naturalOrder());
        return comparator;
    }
}
