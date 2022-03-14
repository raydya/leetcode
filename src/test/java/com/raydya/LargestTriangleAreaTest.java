package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class LargestTriangleAreaTest {

    @Test
    public void test1() {
        final LargestTriangleArea solution = new LargestTriangleArea();
        final double output = solution.largestTriangleArea(
            new int[][]{{0, 0}, {0, 1}, {1, 0}, {0, 2}, {2, 0}});

        Assert.assertEquals(2, output, 0);
    }

    @Test
    public void test2() {
        final LargestTriangleArea solution = new LargestTriangleArea();
        final double output = solution.largestTriangleArea(new int[][]{{4, 6}, {6, 5}, {3, 1}});

        Assert.assertEquals(5.5, output, 0);
    }
}
