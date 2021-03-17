package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class LongestIncreasingSubsequenceTest {
    @Test
    public void test1() {
        final LongestIncreasingSubsequence solution = new LongestIncreasingSubsequence();
        final int output = solution.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18});

        Assert.assertEquals(4, output);
    }

    @Test
    public void test2() {
        final LongestIncreasingSubsequence solution = new LongestIncreasingSubsequence();
        final int output = solution.lengthOfLIS(new int[]{0, 1, 0, 3, 2, 3});

        Assert.assertEquals(4, output);
    }

    @Test
    public void test3() {
        final LongestIncreasingSubsequence solution = new LongestIncreasingSubsequence();
        final int output = solution.lengthOfLIS(new int[]{7});

        Assert.assertEquals(1, output);
    }
}
