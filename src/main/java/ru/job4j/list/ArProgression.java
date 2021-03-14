package ru.job4j.list;

import java.util.List;


public class ArProgression {

    public static int checkData(List<Integer> data) {
        boolean count = true;
        int sum = 0;
        for (int i = 0; i < data.size() - 2; i++) {
            if (data.get(i + 1) != (data.get(i) + data.get(i + 2)) / 2) {
                count = false;
                sum = 0;
                break;
            }
        }
        if (count) {
            for (Integer el : data) {
                sum += el;
            }
        }
        return sum;

    }
}
