package ru.job4j.map;

import java.util.Map;

public class ComputeIfPresent {
    public static Map<Integer, String> collectData(Map<Integer, String> name,
                                                   Map<Integer, String> surname) {
        for (Integer el : name.keySet()
        ) {
            name.computeIfPresent(el, (key, value) -> value + " " + surname.get(el));
        }
        return name;
    }
}
