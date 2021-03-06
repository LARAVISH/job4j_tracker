package ru.job4j.map;

import java.util.*;

public class Dictionary {
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new HashMap<>();

        for (String str : strings) {
            rsl.putIfAbsent(String.valueOf(str.charAt(0)), new ArrayList<>());
        }

        for (String strFromKeySet : rsl.keySet()) {
            List<String> listBuffer = new ArrayList<>();
            for (String str : strings) {
                if (strFromKeySet.equals(String.valueOf(str.charAt(0)))) {
                    listBuffer.add(str);
                }
            }
            rsl.computeIfPresent(strFromKeySet, (key, value) -> value = listBuffer);
        }
        return rsl;
    }
}
