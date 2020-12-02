package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CombinationSumIITest {
    @Test
    public void test1() {
        final CombinationSumII solution = new CombinationSumII();
        final List<List<Integer>> sum2 = solution.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);

        Assert.assertArrayEquals(new Integer[]{1, 1, 6}, sum2.get(0).toArray());
        Assert.assertArrayEquals(new Integer[]{1, 2, 5}, sum2.get(1).toArray());
        Assert.assertArrayEquals(new Integer[]{1, 7}, sum2.get(2).toArray());
        Assert.assertArrayEquals(new Integer[]{2, 6}, sum2.get(3).toArray());
    }

    @Test
    public void test2() {
        final CombinationSumII solution = new CombinationSumII();
        final List<List<Integer>> sum2 = solution.combinationSum2(new int[]{2, 5, 2, 1, 2}, 5);

        Assert.assertArrayEquals(new Integer[]{1, 2, 2}, sum2.get(0).toArray());
        Assert.assertArrayEquals(new Integer[]{5}, sum2.get(1).toArray());
    }
}
