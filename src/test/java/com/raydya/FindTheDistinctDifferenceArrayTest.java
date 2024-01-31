package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindTheDistinctDifferenceArrayTest {

    @Test
    public void test1() {
        final FindTheDistinctDifferenceArray solution = new FindTheDistinctDifferenceArray();
        final int[] output = solution.distinctDifferenceArray(new int[]{1, 2, 3, 4, 5});

        Assert.assertArrayEquals(new int[]{-3, -1, 1, 3, 5}, output);
    }

    @Test
    public void test2() {
        final FindTheDistinctDifferenceArray solution = new FindTheDistinctDifferenceArray();
        final int[] output = solution.distinctDifferenceArray(new int[]{3, 2, 3, 4, 2});

        Assert.assertArrayEquals(new int[]{-2, -1, 0, 2, 3}, output);
    }
}
