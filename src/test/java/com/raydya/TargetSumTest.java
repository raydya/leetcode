package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class TargetSumTest {
    @Test
    public void test1() {
        final TargetSum solution = new TargetSum();
        final int output = solution.findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3);

        Assert.assertEquals(5, output);
    }
}
