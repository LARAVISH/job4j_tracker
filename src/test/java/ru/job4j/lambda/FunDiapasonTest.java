package ru.job4j.lambda;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;

class FunDiapasonTest {

    @Test
    void diapason() {
        List<Double> result = FunDiapason.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        MatcherAssert.assertThat(result, is(expected));
    }
    @Test
    void diapasonQuadrate() {
        List<Double> result = FunDiapason.diapason(5, 8, x -> x * x );
        List<Double> expected = Arrays.asList(25D, 36D, 49D);
        MatcherAssert.assertThat(result, is(expected));
    }
    @Test
    void diapasonExp() {
        List<Double> result = FunDiapason.diapason(5, 8, x -> Math.pow(2,x) );
        List<Double> expected = Arrays.asList(32D, 64D, 128D);
        MatcherAssert.assertThat(result, is(expected));
    }
}