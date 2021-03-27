package ru.job4j.collection.comparator;

import java.util.Comparator;

public class NullFirstMethod {
    public static Comparator<String> nullFirst() {
        Comparator<String> stringComparator = (a,b)-> a.compareTo(b);
        stringComparator = Comparator.nullsFirst(Comparator.naturalOrder());

        return stringComparator;
    }
}
