package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertToMap {
    public Map<String, Student> convertToMap(List<Student> studentList) {
        return studentList.stream()
                .collect(Collectors.toMap(
                        Student::getSurname, e -> e
                        , (s, e) -> s.equals(e) ? s : e)
                );
    }
}
