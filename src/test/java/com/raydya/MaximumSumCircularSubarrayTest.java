package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MaximumSumCircularSubarrayTest {

    @Test
    public void test1() {
        final MaximumSumCircularSubarray solution = new MaximumSumCircularSubarray();
        final int output = solution.maxSubarrayCircular(new int[]{1, -2, 3, -2});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final MaximumSumCircularSubarray solution = new MaximumSumCircularSubarray();
        final int output = solution.maxSubarrayCircular(new int[]{5, -3, 5});

        Assert.assertEquals(10, output);
    }

    @Test
    public void test3() {
        final MaximumSumCircularSubarray solution = new MaximumSumCircularSubarray();
        final int output = solution.maxSubarrayCircular(new int[]{3, -2, 2, -3});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test4() {
        final MaximumSumCircularSubarray solution = new MaximumSumCircularSubarray();
        final int output = solution.maxSubarrayCircular(new int[]{-3, -2, -3});

        Assert.assertEquals(-2, output);
    }

    @Test
    public void test5() {
        final MaximumSumCircularSubarray solution = new MaximumSumCircularSubarray();
        final int output = solution.maxSubarrayCircular(new int[]{3, -1, 2, -1});

        Assert.assertEquals(4, output);
    }
}
