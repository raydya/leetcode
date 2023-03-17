package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubsequenceWithLimitedSumTest {

    @Test
    public void test1() {
        final LongestSubsequenceWithLimitedSum solution = new LongestSubsequenceWithLimitedSum();
        final int[] output = solution.answerQueries(new int[]{4, 5, 2, 1}, new int[]{3, 10, 21});

        Assert.assertArrayEquals(new int[]{2, 3, 4}, output);
    }

    @Test
    public void test2() {
        final LongestSubsequenceWithLimitedSum solution = new LongestSubsequenceWithLimitedSum();
        final int[] output = solution.answerQueries(new int[]{2, 3, 4, 5}, new int[]{1});

        Assert.assertArrayEquals(new int[]{0}, output);
    }
}
