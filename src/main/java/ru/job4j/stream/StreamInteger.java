package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamInteger {
    public static void main(String[] args) {
        List<Integer>list = List.of(1,-2,5,0,90,-35,45);
        list = list.stream().filter(s -> s > 0).collect(Collectors.toList());
    }
}
