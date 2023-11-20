package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MaximumSubArrayTest {

    @Test
    public void test1() {
        final MaximumSubArray solution = new MaximumSubArray();
        final int output = solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});

        Assert.assertEquals(6, output);
    }

    @Test
    public void test2() {
        final MaximumSubArray solution = new MaximumSubArray();
        final int output = solution.maxSubArray(new int[]{1});

        Assert.assertEquals(1, output);
    }

    @Test
    public void test3() {
        final MaximumSubArray solution = new MaximumSubArray();
        final int output = solution.maxSubArray(new int[]{5, 4, -1, 7, 8});

        Assert.assertEquals(23, output);
    }
}
