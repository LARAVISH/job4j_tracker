package ru.job4j.lambda;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionPowTest {

    @Test
    public void calculate() {
      Assert.assertEquals(4, FunctionPow.calculate(2), 0.01);

    }
}