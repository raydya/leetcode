package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberOfPairsInArrayTest {

    @Test
    public void test1() {
        final MaximumNumberOfPairsInArray solution = new MaximumNumberOfPairsInArray();
        final int[] output = solution.numberOfPairs(new int[]{1, 3, 2, 1, 3, 2, 2});

        Assert.assertArrayEquals(new int[]{3, 1}, output);
    }

    @Test
    public void test2() {
        final MaximumNumberOfPairsInArray solution = new MaximumNumberOfPairsInArray();
        final int[] output = solution.numberOfPairs(new int[]{1, 1});

        Assert.assertArrayEquals(new int[]{1, 0}, output);
    }

    @Test
    public void test3() {
        final MaximumNumberOfPairsInArray solution = new MaximumNumberOfPairsInArray();
        final int[] output = solution.numberOfPairs(new int[]{0});

        Assert.assertArrayEquals(new int[]{0, 1}, output);
    }
}
