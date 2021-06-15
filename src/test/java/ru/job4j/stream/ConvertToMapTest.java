package ru.job4j.stream;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;

class ConvertToMapTest {
    @Test
    void convertToMap() {
        ConvertToMap convertToMap = new ConvertToMap();
        List<Student> studentList = new ArrayList<>();
        Student st1 = new Student(10, "Surname1");
        Student st2 = new Student(40, "Surname4");
        Student st3 = new Student(10, "Surname1");
        Student st4 = new Student(90, "Surname9");
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        Map<String, Student> converted = convertToMap.convertToMap(studentList);
        Map<String, Student> expected = new HashMap<>();
        expected.put(st1.getSurname(), st1);
        expected.put(st2.getSurname(), st2);
        expected.put(st3.getSurname(), st3);
        expected.put(st4.getSurname(), st4);
        MatcherAssert.assertThat(converted, is(expected));
    }
}