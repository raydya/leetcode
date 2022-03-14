package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class WiggleSortTest {

    @Test
    public void test1() {
        final int[] nums = {1, 5, 1, 1, 6, 4};

        final WiggleSort solution = new WiggleSort();
        solution.wiggleSort(nums);

        Assert.assertArrayEquals(new int[]{1, 6, 1, 5, 1, 4}, nums);
    }

    @Test
    public void test2() {
        final int[] nums = {1, 3, 2, 2, 3, 1};

        final WiggleSort solution = new WiggleSort();
        solution.wiggleSort(nums);

        Assert.assertArrayEquals(new int[]{2, 3, 1, 3, 1, 2}, nums);
    }
}
