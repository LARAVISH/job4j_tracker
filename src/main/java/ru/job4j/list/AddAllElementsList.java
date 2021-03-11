package ru.job4j.list;

import java.util.List;

public class AddAllElementsList {
    public static int containsElement(List<String> left, List<String> right, String str) {

        for (String s : left) {
            for (String s1 : right) {
                if (s.contains(str) && s1.contains(str)) {
                    left.remove(str);
                }
            }

        }
        left.addAll(right);
        return left.indexOf(str);
    }

}
