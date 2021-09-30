package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class RectangleAreaTest {
    @Test
    public void test1() {
        final RectangleArea solution = new RectangleArea();
        final int output = solution.computeArea(-3, 0, 3, 4, 0, -1, 9, 2);

        Assert.assertEquals(45, output);
    }

    @Test
    public void test2() {
        final RectangleArea solution = new RectangleArea();
        final int output = solution.computeArea(-2, -2, 2, 2, -2, -2, 2, 2);

        Assert.assertEquals(16, output);
    }

    @Test
    public void test3() {
        final RectangleArea solution = new RectangleArea();
        final int output = solution.computeArea(0, 0, 0, 0, -1, -1, 1, 1);

        Assert.assertEquals(4, output);
    }

    @Test
    public void test4() {
        final RectangleArea solution = new RectangleArea();
        final int output = solution.computeArea(-2, -2, 2, 2, 3, 3, 4, 4);

        Assert.assertEquals(17, output);
    }

    @Test
    public void test5() {
        final RectangleArea solution = new RectangleArea();
        final int output = solution.computeArea(-2, -2, 2, 2, -3, -3, -2, -2);

        Assert.assertEquals(17, output);
    }
}
