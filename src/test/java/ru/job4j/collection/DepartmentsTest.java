package ru.job4j.collection;

import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DepartmentsTest {
    @Test
    public void whenMissed() {
        List<String> input = Collections.singletonList("k1/sk1");
        List<String> expect = List.of("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        Departments.sortAsc(result);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChange() {
        List<String> input = List.of("k1", "k1/sk1");
        List<String> expect = List.of("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        Departments.sortDesk(result);
        assertThat(result, is(expect));
    }
    @Test
    public void whenMissed1() {
        List<String> input = List.of("k1/sk1/ssk1");
        List<String> expect = List.of("k1", "k1/sk1", "k1/sk1/ssk1");
        List<String> result = Departments.fillGaps(input);
        Departments.sortAsc(result);
        assertThat(result, is(expect));
    }
    @Test
    public void whenMissed2() {
        List<String> input = List.of("k1/sk1", "k2/sk2");
        List<String> expect = List.of("k2", "k2/sk2", "k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        Departments.sortDesk(result);
        assertThat(result, is(expect));
    }
}