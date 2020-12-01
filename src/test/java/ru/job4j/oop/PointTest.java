package ru.job4j.oop;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import junit.framework.TestCase;
import org.junit.Test;

public class PointTest extends TestCase {
    @Test
    public void testDistance() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 1);
        double res = a.distance(b);
        assertThat(res, closeTo(1, 0.001));


    }

    @Test
    public void testDistance3d() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 1);
        double res = a.distance3d(b);
        assertThat(res, closeTo(1, 0.001));

    }
}