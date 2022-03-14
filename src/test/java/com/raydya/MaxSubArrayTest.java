package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MaxSubArrayTest {

    @Test
    public void test1() {
        int[] input = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};

        final MaxSubArray solution = new MaxSubArray();
        final int sum = solution.maxSubArray(input);

        Assert.assertEquals(6, sum);
    }

    @Test
    public void test2() {
        int[] input = new int[]{1};

        final MaxSubArray solution = new MaxSubArray();
        final int sum = solution.maxSubArray(input);

        Assert.assertEquals(1, sum);
    }

    @Test
    public void test3() {
        int[] input = new int[]{0};

        final MaxSubArray solution = new MaxSubArray();
        final int sum = solution.maxSubArray(input);

        Assert.assertEquals(0, sum);
    }

    @Test
    public void test4() {
        int[] input = new int[]{-1};

        final MaxSubArray solution = new MaxSubArray();
        final int sum = solution.maxSubArray(input);

        Assert.assertEquals(-1, sum);
    }

    @Test
    public void test5() {
        int[] input = new int[]{-2147483647};

        final MaxSubArray solution = new MaxSubArray();
        final int sum = solution.maxSubArray(input);

        Assert.assertEquals(-2147483647, sum);
    }

    @Test
    public void test6() {
        int[] input = new int[]{-2, -1};

        final MaxSubArray solution = new MaxSubArray();
        final int sum = solution.maxSubArray(input);

        Assert.assertEquals(-1, sum);
    }

    @Test
    public void test7() {
        int[] input = new int[]{-2, 1};

        final MaxSubArray solution = new MaxSubArray();
        final int sum = solution.maxSubArray(input);

        Assert.assertEquals(1, sum);
    }

    @Test
    public void test8() {
        int[] input = new int[]{-1, -2};

        final MaxSubArray solution = new MaxSubArray();
        final int sum = solution.maxSubArray(input);

        Assert.assertEquals(-1, sum);
    }
}
