package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FourSumIITest {

    @Test
    public void test1() {
        final FourSumII solution = new FourSumII();
        final int output = solution.fourSumCount(new int[]{1, 2}, new int[]{-2, -1},
            new int[]{-1, 2}, new int[]{0, 2});

        Assert.assertEquals(2, output);
    }
}
