package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CircleAndRectangleOverlappingTest {

    @Test
    public void test1() {
        final CircleAndRectangleOverlapping solution = new CircleAndRectangleOverlapping();
        final boolean output = solution.checkOverlap(1, 0, 0, 1, -1, 3, 1);

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final CircleAndRectangleOverlapping solution = new CircleAndRectangleOverlapping();
        final boolean output = solution.checkOverlap(1, 0, 0, -1, 0, 0, 1);

        Assert.assertTrue(output);
    }

    @Test
    public void test3() {
        final CircleAndRectangleOverlapping solution = new CircleAndRectangleOverlapping();
        final boolean output = solution.checkOverlap(1, 1, 1, -3, -3, 3, 3);

        Assert.assertTrue(output);
    }
}
