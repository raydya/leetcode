package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MaximumAbsoluteSumOfAnySubarrayTest {

    @Test
    public void test1() {
        final MaximumAbsoluteSumOfAnySubarray solution = new MaximumAbsoluteSumOfAnySubarray();
        final int output = solution.maxAbsoluteSum(new int[]{1, -3, 2, 3, -4});

        Assert.assertEquals(5, output);
    }

    @Test
    public void test2() {
        final MaximumAbsoluteSumOfAnySubarray solution = new MaximumAbsoluteSumOfAnySubarray();
        final int output = solution.maxAbsoluteSum(new int[]{2, -5, 1, -4, 3, -2});

        Assert.assertEquals(8, output);
    }

    @Test
    public void test3() {
        final MaximumAbsoluteSumOfAnySubarray solution = new MaximumAbsoluteSumOfAnySubarray();
        final int output = solution.maxAbsoluteSum(
            new int[]{-7, -1, 0, -2, 1, 3, 8, -2, -6, -1, -10, -6, -6, 8, -4, -9, -4, 1, 4, -9});

        Assert.assertEquals(44, output);
    }

    @Test
    public void test4() {
        final MaximumAbsoluteSumOfAnySubarray solution = new MaximumAbsoluteSumOfAnySubarray();
        final int output = solution.maxAbsoluteSum(
            new int[]{-3, -5, -3, -2, -6, 3, 10, -10, -8, -3, 0, 10, 3, -5, 8, 7, -9, -9, 5, -8});

        Assert.assertEquals(27, output);
    }
}
