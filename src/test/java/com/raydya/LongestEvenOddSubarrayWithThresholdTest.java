package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class LongestEvenOddSubarrayWithThresholdTest {

    @Test
    public void test1() {
        final LongestEvenOddSubarrayWithThreshold solution = new LongestEvenOddSubarrayWithThreshold();
        final int output = solution.longestAlternatingSubarray(new int[]{3, 2, 5, 4}, 5);

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final LongestEvenOddSubarrayWithThreshold solution = new LongestEvenOddSubarrayWithThreshold();
        final int output = solution.longestAlternatingSubarray(new int[]{1, 2}, 2);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test3() {
        final LongestEvenOddSubarrayWithThreshold solution = new LongestEvenOddSubarrayWithThreshold();
        final int output = solution.longestAlternatingSubarray(new int[]{2, 3, 4, 5}, 4);

        Assert.assertEquals(3, output);
    }

    @Test
    public void test4() {
        final LongestEvenOddSubarrayWithThreshold solution = new LongestEvenOddSubarrayWithThreshold();
        final int output = solution.longestAlternatingSubarray(new int[]{2, 8}, 4);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test5() {
        final LongestEvenOddSubarrayWithThreshold solution = new LongestEvenOddSubarrayWithThreshold();
        final int output = solution.longestAlternatingSubarray(new int[]{4}, 1);

        Assert.assertEquals(0, output);
    }

    @Test
    public void test6() {
        final LongestEvenOddSubarrayWithThreshold solution = new LongestEvenOddSubarrayWithThreshold();
        final int output = solution.longestAlternatingSubarray(new int[]{2, 2}, 18);

        Assert.assertEquals(1, output);
    }

}
