package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {

        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                if (start.equals("")) {
                    start = el;
                } else {
                    start  += "/" + el;
                }
                tmp.add(start);
            }
        }
        List<String> res = new ArrayList<>(tmp);
        sortAsc(res);
        sortDesk(res);
        return res;
    }


    public static void sortAsc(List<String> orgs) {
        orgs.sort(Comparator.naturalOrder());
    }

    public static void sortDesk(List<String> orgs) {
        orgs.sort(new DepDescComp());
    }
}
