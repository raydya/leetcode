package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class LongestContinuousIncreasingSubsequenceTest {
    @Test
    public void test1() {
        final LongestContinuousIncreasingSubsequence solution = new LongestContinuousIncreasingSubsequence();
        final int output = solution.findLengthOfLCIS(new int[]{1, 3, 5, 4, 7});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final LongestContinuousIncreasingSubsequence solution = new LongestContinuousIncreasingSubsequence();
        final int output = solution.findLengthOfLCIS(new int[]{2, 2, 2, 2, 2});

        Assert.assertEquals(1, output);
    }

    @Test
    public void test3() {
        final LongestContinuousIncreasingSubsequence solution = new LongestContinuousIncreasingSubsequence();
        final int output = solution.findLengthOfLCIS(new int[]{1, 3, 5, 7});

        Assert.assertEquals(4, output);
    }
}
