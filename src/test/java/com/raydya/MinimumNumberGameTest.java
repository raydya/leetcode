package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinimumNumberGameTest {

    @Test
    public void test1() {
        final MinimumNumberGame solution = new MinimumNumberGame();
        final int[] output = solution.numberGame(new int[]{5, 4, 2, 3});

        Assert.assertArrayEquals(new int[]{3, 2, 5, 4}, output);
    }

    @Test
    public void test2() {
        final MinimumNumberGame solution = new MinimumNumberGame();
        final int[] output = solution.numberGame(new int[]{2, 5});

        Assert.assertArrayEquals(new int[]{5, 2}, output);
    }
}
