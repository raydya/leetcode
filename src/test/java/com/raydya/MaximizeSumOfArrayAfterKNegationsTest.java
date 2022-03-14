package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MaximizeSumOfArrayAfterKNegationsTest {

    @Test
    public void test1() {
        final MaximizeSumOfArrayAfterKNegations solution = new MaximizeSumOfArrayAfterKNegations();
        final int output = solution.largestSumAfterKNegations(new int[]{4, 2, 3}, 1);

        Assert.assertEquals(5, output);
    }

    @Test
    public void test2() {
        final MaximizeSumOfArrayAfterKNegations solution = new MaximizeSumOfArrayAfterKNegations();
        final int output = solution.largestSumAfterKNegations(new int[]{3, -1, 0, 2}, 3);

        Assert.assertEquals(6, output);
    }

    @Test
    public void test3() {
        final MaximizeSumOfArrayAfterKNegations solution = new MaximizeSumOfArrayAfterKNegations();
        final int output = solution.largestSumAfterKNegations(new int[]{2, -3, -1, 5, -4}, 2);

        Assert.assertEquals(13, output);
    }

    @Test
    public void test4() {
        final MaximizeSumOfArrayAfterKNegations solution = new MaximizeSumOfArrayAfterKNegations();
        final int output = solution.largestSumAfterKNegations(new int[]{1, 3, 2, 6, 7, 9}, 3);

        Assert.assertEquals(26, output);

    }

    @Test
    public void test5() {
        final MaximizeSumOfArrayAfterKNegations solution = new MaximizeSumOfArrayAfterKNegations();
        final int output = solution.largestSumAfterKNegations(new int[]{-8, 3, -5, -3, -5, -2}, 6);

        Assert.assertEquals(22, output);
    }

    @Test
    public void test6() {
        final MaximizeSumOfArrayAfterKNegations solution = new MaximizeSumOfArrayAfterKNegations();
        final int output = solution.largestSumAfterKNegations(new int[]{-2, 5, 0, 2, -2}, 3);

        Assert.assertEquals(11, output);
    }

    @Test
    public void test7() {
        final MaximizeSumOfArrayAfterKNegations solution = new MaximizeSumOfArrayAfterKNegations();
        final int output = solution.largestSumAfterKNegations(
            new int[]{8, -7, -3, -9, 1, 9, -6, -9, 3}, 8);

        Assert.assertEquals(53, output);
    }

    @Test
    public void test8() {
        final MaximizeSumOfArrayAfterKNegations solution = new MaximizeSumOfArrayAfterKNegations();
        final int output = solution.largestSumAfterKNegations(new int[]{-4, -2, -3}, 4);

        Assert.assertEquals(5, output);
    }
}
