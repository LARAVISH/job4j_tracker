package ru.job4j.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Article {
    public static boolean generateBy(String origin, String line) {
        Set<String> hStrings = new HashSet<>();
        boolean res = true;
        String[] originalText = origin.split("");
        String[] newText = line.split("");
        Collections.addAll(hStrings, originalText);
        for (String el : newText) {
            if (!hStrings.contains(el)) {
                res = false;
                break;
            }
        }
        return res;
    }
}
