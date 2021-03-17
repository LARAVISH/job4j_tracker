package ru.job4j.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Jackpot {
    public static boolean checkYourWin(String[] combination) {
        boolean res = true;
        Set<String> check = new HashSet<>();
        Collections.addAll(check, combination);
        if (!(check.size() == 1)) {
            res = false;
        }
        return res;
    }
}
