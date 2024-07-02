package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MaximumPrimeDifferenceTest {

    @Test
    public void test1() {
        final MaximumPrimeDifference solution = new MaximumPrimeDifference();
        final int output = solution.maximumPrimeDifference(new int[]{4, 2, 9, 5, 3});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final MaximumPrimeDifference solution = new MaximumPrimeDifference();
        final int output = solution.maximumPrimeDifference(new int[]{4, 8, 2, 8});

        Assert.assertEquals(0, output);
    }
}
