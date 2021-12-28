package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class RelativeSortArrayTest {
    @Test
    public void test1() {
        final RelativeSortArray solution = new RelativeSortArray();
        final int[] output = solution.relativeSortArray(new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, new int[]{2, 1, 4, 3, 9, 6});

        Assert.assertArrayEquals(new int[]{2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19}, output);
    }
}
