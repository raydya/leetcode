package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class PlusOneTest {

    @Test
    public void test1() {
        final int[] input = new int[]{1, 2, 3};

        final PlusOne solution = new PlusOne();
        final int[] output = solution.plusOne(input);

        Assert.assertArrayEquals(new int[]{1, 2, 4}, output);
    }

    @Test
    public void test2() {
        final int[] input = new int[]{4, 3, 2, 1};

        final PlusOne solution = new PlusOne();
        final int[] output = solution.plusOne(input);

        Assert.assertArrayEquals(new int[]{4, 3, 2, 2}, output);
    }

    @Test
    public void test3() {
        final int[] input = new int[]{0};

        final PlusOne solution = new PlusOne();
        final int[] output = solution.plusOne(input);

        Assert.assertArrayEquals(new int[]{1}, output);
    }

    @Test
    public void test4() {
        final int[] input = new int[]{9};

        final PlusOne solution = new PlusOne();
        final int[] output = solution.plusOne(input);

        Assert.assertArrayEquals(new int[]{1, 0}, output);
    }

    @Test
    public void test5() {
        final int[] input = new int[]{9, 9};

        final PlusOne solution = new PlusOne();
        final int[] output = solution.plusOne(input);

        Assert.assertArrayEquals(new int[]{1, 0, 0}, output);
    }
}
