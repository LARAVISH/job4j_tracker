package ru.job4j.set;

import java.util.Collections;
import java.util.HashSet;

public class Pangram {

public static boolean checkString(String s){
        boolean res = true;
        String[] text = s.split(" ");
    HashSet<String> check = new HashSet<>();
    Collections.addAll(check,text);
    for(String el : check){
        if (!check.contains(el)) {
            res = false;
            break;
        }
    }
    return res;
}
}
