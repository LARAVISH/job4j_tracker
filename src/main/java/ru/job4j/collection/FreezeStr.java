package ru.job4j.collection;


import java.util.HashMap;
import java.util.Map;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        Map<Character, Integer> map = new HashMap<>();
        if (left.length() != right.length()) {
            return false;
        }
        for (Character el : left.toCharArray()) {
            if (!map.containsKey(el)) {
                map.put(el, 1);
            } else {
                map.put(el, map.get(el) + 1);
            }
        }
        for (Character el : right.toCharArray()) {
            if (!map.containsKey(el)) {
                return false;
            } else {
                map.put(el, map.get(el) - 1);
            }
        }
        for (Character el : map.keySet()) {
            if (map.get(el) != 0) {
                return false;
            }
        }
        return true;
    }
}