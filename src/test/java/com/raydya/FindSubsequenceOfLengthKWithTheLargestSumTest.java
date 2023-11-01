package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindSubsequenceOfLengthKWithTheLargestSumTest {

    @Test
    public void test1() {
        final FindSubsequenceOfLengthKWithTheLargestSum solution = new FindSubsequenceOfLengthKWithTheLargestSum();
        final int[] output = solution.maxSubsequence(new int[]{2, 1, 3, 3}, 2);

        Assert.assertArrayEquals(new int[]{3, 3}, output);
    }

    @Test
    public void test2() {
        final FindSubsequenceOfLengthKWithTheLargestSum solution = new FindSubsequenceOfLengthKWithTheLargestSum();
        final int[] output = solution.maxSubsequence(new int[]{-1, -2, 3, 4}, 3);

        Assert.assertArrayEquals(new int[]{-1, 3, 4}, output);
    }

    @Test
    public void test3() {
        final FindSubsequenceOfLengthKWithTheLargestSum solution = new FindSubsequenceOfLengthKWithTheLargestSum();
        final int[] output = solution.maxSubsequence(new int[]{3, 4, 3, 3}, 2);

        Assert.assertArrayEquals(new int[]{4, 3}, output);
    }

    @Test
    public void test4() {
        final FindSubsequenceOfLengthKWithTheLargestSum solution = new FindSubsequenceOfLengthKWithTheLargestSum();
        final int[] output = solution.maxSubsequence(new int[]{50, -75}, 2);

        Assert.assertArrayEquals(new int[]{50, -75}, output);
    }

    @Test
    public void test5() {
        final FindSubsequenceOfLengthKWithTheLargestSum solution = new FindSubsequenceOfLengthKWithTheLargestSum();
        final int[] output = solution.maxSubsequence(new int[]{63, -74, 61, -17, -55, -59, -10, 2, -60, -65}, 9);

        Assert.assertArrayEquals(new int[]{63, 61, -17, -55, -59, -10, 2, -60, -65}, output);
    }
}
