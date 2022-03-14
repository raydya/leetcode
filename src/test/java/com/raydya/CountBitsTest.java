package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CountBitsTest {

    @Test
    public void test1() {
        final CountBits solution = new CountBits();
        final int[] output = solution.countBits(2);

        Assert.assertArrayEquals(new int[]{0, 1, 1}, output);
    }

    @Test
    public void test2() {
        final CountBits solution = new CountBits();
        final int[] output = solution.countBits(5);

        Assert.assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, output);
    }

    @Test
    public void test3() {
        final CountBits solution = new CountBits();
        final int[] output = solution.countBits(8);

        Assert.assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2, 2, 3, 1}, output);
    }

    @Test
    public void test4() {
        final CountBits solution = new CountBits();
        final int[] output = solution.countBits(1);

        Assert.assertArrayEquals(new int[]{0, 1}, output);
    }
}
