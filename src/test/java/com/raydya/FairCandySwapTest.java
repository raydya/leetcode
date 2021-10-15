package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FairCandySwapTest {
    @Test
    public void test1() {
        final FairCandySwap solution = new FairCandySwap();
        final int[] output = solution.fairCandySwap(new int[]{1, 1}, new int[]{2, 2});

        Assert.assertArrayEquals(new int[]{1, 2}, output);
    }

    @Test
    public void test2() {
        final FairCandySwap solution = new FairCandySwap();
        final int[] output = solution.fairCandySwap(new int[]{1, 2}, new int[]{2, 3});

        Assert.assertArrayEquals(new int[]{1, 2}, output);
    }

    @Test
    public void test3() {
        final FairCandySwap solution = new FairCandySwap();
        final int[] output = solution.fairCandySwap(new int[]{2}, new int[]{1, 3});

        Assert.assertArrayEquals(new int[]{2, 3}, output);
    }

    @Test
    public void test4() {
        final FairCandySwap solution = new FairCandySwap();
        final int[] output = solution.fairCandySwap(new int[]{1, 2, 5}, new int[]{2, 4});

        Assert.assertArrayEquals(new int[]{5, 4}, output);
    }
}
