package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinimumSumOfMountainTripletsITest {

    @Test
    public void test1() {
        final MinimumSumOfMountainTripletsI solution = new MinimumSumOfMountainTripletsI();
        final int output = solution.minimumSum(new int[]{8, 6, 1, 5, 3});

        Assert.assertEquals(9, output);
    }

    @Test
    public void test2() {
        final MinimumSumOfMountainTripletsI solution = new MinimumSumOfMountainTripletsI();
        final int output = solution.minimumSum(new int[]{5, 4, 8, 7, 10, 2});

        Assert.assertEquals(13, output);
    }

    @Test
    public void test3() {
        final MinimumSumOfMountainTripletsI solution = new MinimumSumOfMountainTripletsI();
        final int output = solution.minimumSum(new int[]{6, 5, 4, 3, 4, 5});

        Assert.assertEquals(-1, output);
    }
}
