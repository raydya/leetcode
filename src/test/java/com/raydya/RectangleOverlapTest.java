package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class RectangleOverlapTest {
    @Test
    public void test1() {
        final RectangleOverlap solution = new RectangleOverlap();
        final boolean output = solution.isRectangleOverlap(new int[]{0, 0, 2, 2}, new int[]{1, 1, 3, 3});

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final RectangleOverlap solution = new RectangleOverlap();
        final boolean output = solution.isRectangleOverlap(new int[]{0, 0, 1, 1}, new int[]{1, 0, 2, 1});

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final RectangleOverlap solution = new RectangleOverlap();
        final boolean output = solution.isRectangleOverlap(new int[]{0, 0, 1, 1}, new int[]{2, 2, 3, 3});

        Assert.assertFalse(output);
    }


    @Test
    public void test4() {
        final RectangleOverlap solution = new RectangleOverlap();
        final boolean output = solution.isRectangleOverlap(new int[]{5, 15, 8, 18}, new int[]{0, 3, 7, 9});

        Assert.assertFalse(output);
    }
}
