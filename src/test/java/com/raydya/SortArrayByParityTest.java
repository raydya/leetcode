package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SortArrayByParityTest {
    @Test
    public void test1() {
        final SortArrayByParity solution = new SortArrayByParity();
        final int[] output = solution.sortArrayByParity(new int[]{3, 1, 2, 4});

        Assert.assertArrayEquals(new int[]{2, 4, 1, 3}, output);
    }
}
