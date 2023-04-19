package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MaximumAscendingSubarraySumTest {

    @Test
    public void test1() {
        final MaximumAscendingSubarraySum solution = new MaximumAscendingSubarraySum();
        final int output = solution.maxAscendingSum(new int[]{10, 20, 30, 5, 10, 50});

        Assert.assertEquals(65, output);
    }

    @Test
    public void test2() {
        final MaximumAscendingSubarraySum solution = new MaximumAscendingSubarraySum();
        final int output = solution.maxAscendingSum(new int[]{10, 20, 30, 40, 50});

        Assert.assertEquals(150, output);
    }


    @Test
    public void test3() {
        final MaximumAscendingSubarraySum solution = new MaximumAscendingSubarraySum();
        final int output = solution.maxAscendingSum(new int[]{12, 17, 15, 13, 10, 11, 12});

        Assert.assertEquals(33, output);
    }

    @Test
    public void test4() {
        final MaximumAscendingSubarraySum solution = new MaximumAscendingSubarraySum();
        final int output = solution.maxAscendingSum(new int[]{100, 10, 1});

        Assert.assertEquals(100, output);
    }

    @Test
    public void test5() {
        final MaximumAscendingSubarraySum solution = new MaximumAscendingSubarraySum();
        final int output = solution.maxAscendingSum(new int[]{6});

        Assert.assertEquals(6, output);
    }

    @Test
    public void test6() {
        final MaximumAscendingSubarraySum solution = new MaximumAscendingSubarraySum();
        final int output = solution.maxAscendingSum(new int[]{3, 6, 10, 1, 8, 9, 9, 8, 9});

        Assert.assertEquals(19, output);
    }
}
