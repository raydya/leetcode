package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MaximumSubarraySumWithOneDeletionTest {

    @Test
    public void test1() {
        final MaximumSubarraySumWithOneDeletion solution = new MaximumSubarraySumWithOneDeletion();
        final int output = solution.maximumSum(new int[]{1, -2, 0, 3});

        Assert.assertEquals(4, output);
    }

    @Test
    public void test2() {
        final MaximumSubarraySumWithOneDeletion solution = new MaximumSubarraySumWithOneDeletion();
        final int output = solution.maximumSum(new int[]{1, -2, -2, 3});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test3() {
        final MaximumSubarraySumWithOneDeletion solution = new MaximumSubarraySumWithOneDeletion();
        final int output = solution.maximumSum(new int[]{-1, -1, -1, -1});

        Assert.assertEquals(-1, output);
    }
}
