package ru.job4j.lambda;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionPowTest {

    @Test
    public void calculate() {
        Assert.assertEquals(2, FunctionPow.calculate(4), 0.01);
        assertEquals(3, FunctionPow.calculate(9), 0.01);
    }
}