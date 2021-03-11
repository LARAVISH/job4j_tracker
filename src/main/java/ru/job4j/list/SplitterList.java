package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class SplitterList {
    public static List<String> split(List<String> left, List<String> middle, List<String> right) {

        left.removeAll(right);
        left.retainAll(middle);

        return left;
    }
}
