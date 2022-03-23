package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinimumValueToGetPositiveStepByStepSumTest {

    @Test
    public void test1() {
        final MinimumValueToGetPositiveStepByStepSum solution = new MinimumValueToGetPositiveStepByStepSum();
        final int output = solution.minStateValue(new int[]{-3, 2, -3, 4, 2});

        Assert.assertEquals(5, output);
    }

    @Test
    public void test2() {
        final MinimumValueToGetPositiveStepByStepSum solution = new MinimumValueToGetPositiveStepByStepSum();
        final int output = solution.minStateValue(new int[]{1, 2});

        Assert.assertEquals(1, output);
    }

    @Test
    public void test3() {
        final MinimumValueToGetPositiveStepByStepSum solution = new MinimumValueToGetPositiveStepByStepSum();
        final int output = solution.minStateValue(new int[]{1, -2, -3});

        Assert.assertEquals(5, output);
    }
}
