package com.raydya;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class MinimumSubsequenceInNonIncreasingOrderTest {

    @Test
    public void test1() {
        final MinimumSubsequenceInNonIncreasingOrder solution = new MinimumSubsequenceInNonIncreasingOrder();
        final List<Integer> output = solution.minSubsequence(new int[]{4, 3, 10, 9, 8});

        Assert.assertArrayEquals(new Integer[]{10, 9}, output.toArray());
    }

    @Test
    public void test2() {
        final MinimumSubsequenceInNonIncreasingOrder solution = new MinimumSubsequenceInNonIncreasingOrder();
        final List<Integer> output = solution.minSubsequence(new int[]{4, 4, 7, 6, 7});

        Assert.assertArrayEquals(new Integer[]{7, 7, 6}, output.toArray());
    }

    @Test
    public void test3() {
        final MinimumSubsequenceInNonIncreasingOrder solution = new MinimumSubsequenceInNonIncreasingOrder();
        final List<Integer> output = solution.minSubsequence(new int[]{6});

        Assert.assertArrayEquals(new Integer[]{6}, output.toArray());
    }

}
