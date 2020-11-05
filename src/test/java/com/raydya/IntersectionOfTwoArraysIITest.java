package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class IntersectionOfTwoArraysIITest {
    @Test
    public void test1() {
        final IntersectionOfTwoArraysII solution = new IntersectionOfTwoArraysII();
        final int[] output = solution.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2});

        Assert.assertArrayEquals(new int[]{2, 2}, output);
    }

    @Test
    public void test2() {
        final IntersectionOfTwoArraysII solution = new IntersectionOfTwoArraysII();
        final int[] output = solution.intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});

        Assert.assertArrayEquals(new int[]{4, 9}, output);
    }

    @Test
    public void test3() {
        final IntersectionOfTwoArraysII solution = new IntersectionOfTwoArraysII();
        final int[] output = solution.intersect(new int[]{1, 2, 2, 1}, new int[]{2});

        Assert.assertArrayEquals(new int[]{2}, output);
    }

    @Test
    public void test4() {
        final IntersectionOfTwoArraysII solution = new IntersectionOfTwoArraysII();
        final int[] output = solution.intersect(new int[]{3, 1, 2}, new int[]{1, 1});

        Assert.assertArrayEquals(new int[]{1}, output);
    }
}
