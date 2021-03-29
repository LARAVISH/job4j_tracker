package ru.job4j.collection.comparator;

import java.util.Map;
import java.util.TreeMap;

public class SortMap {
    public static Map<Integer, String> sort(Map<Integer, String> map) {
       Map<Integer, String> integerStringMap = new TreeMap<>(map);
        return integerStringMap;

    }
}
