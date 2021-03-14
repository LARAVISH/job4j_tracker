package ru.job4j.list;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Alphabet {
    public static String reformat(String s) {

        List<String> list = Arrays.asList(s.split(""));
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (String el : list) {
            sb.append(el);
        }
        return sb.toString();
    }

}
