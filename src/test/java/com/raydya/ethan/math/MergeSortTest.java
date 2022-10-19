package com.raydya.ethan.math;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortTest {

    @Test
    public void test1() {
        final MergeSort solution = new MergeSort();
        final int[] output = solution.mergeSort(new int[]{7, 6, 2, 4, 1, 9, 3, 8, 0, 5});

        Assert.assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, output);
    }

}
