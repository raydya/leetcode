package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MaximumProductSubarrayTest {

    @Test
    public void test1() {
        final MaximumProductSubarray solution = new MaximumProductSubarray();
        final int output = solution.maxProduct(new int[]{2, 3, -2, 4});

        Assert.assertEquals(6, output);
    }

    @Test
    public void test2() {
        final MaximumProductSubarray solution = new MaximumProductSubarray();
        final int output = solution.maxProduct(new int[]{-2, 0, -1});

        Assert.assertEquals(0, output);
    }

    @Test
    public void test3() {
        final MaximumProductSubarray solution = new MaximumProductSubarray();
        final int output = solution.maxProduct(new int[]{0, 2});

        Assert.assertEquals(2, output);
    }

    @Test
    public void test4() {
        final MaximumProductSubarray solution = new MaximumProductSubarray();
        final int output = solution.maxProduct(new int[]{-2, 3, -4});

        Assert.assertEquals(24, output);
    }
}
