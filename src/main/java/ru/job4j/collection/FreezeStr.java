package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        Map<Character, Integer> map = new HashMap<>();

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
            } else if (map.containsKey(el) && map.get(el) == 1) {
                map.remove(el);
            } else if (map.containsKey(el) && map.get(el) > 1) {
                map.put(el, map.get(el) - 1);
            }
            if (map.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}