package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SortArrayByParityIITest {
    @Test
    public void test1() {
        final SortArrayByParityII solution = new SortArrayByParityII();
        final int[] output = solution.sortArrayByParityII(new int[]{4, 2, 5, 7});

        Assert.assertArrayEquals(new int[]{4, 5, 2, 7}, output);
    }
}
