package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinimumOperationsToHalveArraySumTest {

    @Test
    public void test1() {
        final MinimumOperationsToHalveArraySum solution = new MinimumOperationsToHalveArraySum();
        final int output = solution.halveArray(new int[]{5, 19, 8, 1});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final MinimumOperationsToHalveArraySum solution = new MinimumOperationsToHalveArraySum();
        final int output = solution.halveArray(new int[]{3, 8, 20});

        Assert.assertEquals(3, output);
    }
}
