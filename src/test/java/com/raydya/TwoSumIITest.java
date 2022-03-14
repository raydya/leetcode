package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumIITest {

    @Test
    public void test1() {
        final TwoSumII solution = new TwoSumII();
        final int[] output = solution.twoSum(new int[]{2, 7, 11, 15}, 9);

        Assert.assertArrayEquals(new int[]{1, 2}, output);
    }

    @Test
    public void test2() {
        final TwoSumII solution = new TwoSumII();
        final int[] output = solution.twoSum(new int[]{2, 3, 4}, 6);

        Assert.assertArrayEquals(new int[]{1, 3}, output);
    }

    @Test
    public void test3() {
        final TwoSumII solution = new TwoSumII();
        final int[] output = solution.twoSum(new int[]{-1, 0}, -1);

        Assert.assertArrayEquals(new int[]{1, 2}, output);
    }
}
