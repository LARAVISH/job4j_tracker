package ru.job4j.stream;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentLevel {
    List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .flatMap(Stream::ofNullable)
                .sorted((x, y) -> Integer.compare(y.getScore(), x.getScore()))
                .takeWhile(v -> v.getScore() > bound)
                .collect(Collectors.toList());
    }
}
