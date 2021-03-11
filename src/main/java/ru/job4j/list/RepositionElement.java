package ru.job4j.list;

import java.util.List;

public class RepositionElement {

    public static List<String> changePosition(List<String> list, int index) {
        try {
            String s = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            list.set(index, s);
        }
       catch (IndexOutOfBoundsException e){
            e.printStackTrace();
       }
        return list;
    }

    }

