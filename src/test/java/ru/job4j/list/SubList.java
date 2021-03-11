package ru.job4j.list;

import java.util.List;

public class SubList {
    public static List<String> getElementsBetweenIndexes(List<String> list, String el) {

        int count = 0;
        for (String s : list) {
            if (s.contains(el)) {
                count++;
            }
        }
        return count <= 1 ? List.of() : list.subList(list.indexOf(el), list.lastIndexOf(el));
    }
}
