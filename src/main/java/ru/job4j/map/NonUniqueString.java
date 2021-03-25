package ru.job4j.map;

import java.util.*;

public class NonUniqueString {
    public static Map<String, Boolean> checkData(String[] strings) {
        Map<String,Boolean> map = new HashMap<>();

        Arrays.sort(strings);
        for (int i = 1; i < strings.length; i++) {
            if ((strings[i - 1].equals(strings[i]))) {
                map.put(strings[i], true);
            } else {
                map.put(strings[i], false);
            }
        }

        return map;
    }
}
