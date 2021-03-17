package ru.job4j.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Firewall {
    public static String checkName(String s, Set<String> words) {
        String res = "Вы сделали правильный выбор!";
        String[] str = s.split(" ");
        Set<String> check = new HashSet<>();
        Collections.addAll(check, str);
        for (String el : words) {
            if (check.contains(el)) {
                res = "Выберите другую статью...";
            }
        }
        return res;
    }
}
