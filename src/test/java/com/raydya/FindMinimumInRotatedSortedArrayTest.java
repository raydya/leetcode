package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindMinimumInRotatedSortedArrayTest {
    @Test
    public void test1() {
        final FindMinimumInRotatedSortedArray solution = new FindMinimumInRotatedSortedArray();
        final int output = solution.findMin(new int[]{3, 4, 5, 1, 2});

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final FindMinimumInRotatedSortedArray solution = new FindMinimumInRotatedSortedArray();
        final int output = solution.findMin(new int[]{4, 5, 6, 7, 0, 1, 2});

        Assert.assertEquals(0, output);
    }

    @Test
    public void test3() {
        final FindMinimumInRotatedSortedArray solution = new FindMinimumInRotatedSortedArray();
        final int output = solution.findMin(new int[]{11, 13, 15, 17});

        Assert.assertEquals(11, output);
    }
}
