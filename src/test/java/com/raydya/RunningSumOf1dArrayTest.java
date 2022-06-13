package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class RunningSumOf1dArrayTest {

    @Test
    public void test1() {
        final RunningSumOf1dArray solution = new RunningSumOf1dArray();
        final int[] output = solution.runningSum(new int[]{1, 2, 3, 4});

        Assert.assertArrayEquals(new int[]{1, 3, 6, 10}, output);
    }

    @Test
    public void test2() {
        final RunningSumOf1dArray solution = new RunningSumOf1dArray();
        final int[] output = solution.runningSum(new int[]{1, 1, 1, 1, 1});

        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, output);
    }

    @Test
    public void test3() {
        final RunningSumOf1dArray solution = new RunningSumOf1dArray();
        final int[] output = solution.runningSum(new int[]{3, 1, 2, 10, 1});

        Assert.assertArrayEquals(new int[]{3, 4, 6, 16, 17}, output);
    }

}
