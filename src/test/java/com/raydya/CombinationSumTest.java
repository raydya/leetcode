package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CombinationSumTest {
    @Test
    public void test1() {
        final CombinationSum solution = new CombinationSum();
        final List<List<Integer>> combinationSum = solution.combinationSum(new int[]{2, 3, 6, 7}, 7);
        final List<Integer> one = combinationSum.get(0);
        Assert.assertArrayEquals(
            new Integer[]{2, 2, 3},
            one.toArray()
        );
        Assert.assertArrayEquals(
            new Integer[]{7},
            combinationSum.get(1).toArray()
        );
    }

    @Test
    public void test2() {
        final CombinationSum solution = new CombinationSum();
        final List<List<Integer>> combinationSum = solution.combinationSum(new int[]{2, 3, 5}, 8);

        Assert.assertArrayEquals(
            new Integer[]{2, 2, 2, 2},
            combinationSum.get(0).toArray()
        );
        Assert.assertArrayEquals(
            new Integer[]{2, 3, 3},
            combinationSum.get(1).toArray()
        );
        Assert.assertArrayEquals(
            new Integer[]{3, 5},
            combinationSum.get(2).toArray()
        );
    }

    @Test
    public void test3() {
        final CombinationSum solution = new CombinationSum();
        final List<List<Integer>> combinationSum = solution.combinationSum(new int[]{2}, 1);

        Assert.assertArrayEquals(
            new int[][]{},
            combinationSum.toArray()
        );
    }

    @Test
    public void test4() {
        final CombinationSum solution = new CombinationSum();
        final List<List<Integer>> combinationSum = solution.combinationSum(new int[]{1}, 1);

        Assert.assertArrayEquals(
            new Integer[]{1},
            combinationSum.get(0).toArray()
        );
    }

    @Test
    public void test5() {
        final CombinationSum solution = new CombinationSum();
        final List<List<Integer>> combinationSum = solution.combinationSum(new int[]{1}, 2);

        Assert.assertArrayEquals(
            new Integer[]{1, 1},
            combinationSum.get(0).toArray()
        );
    }
}
