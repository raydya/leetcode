package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MaximumUnitsOnATruckTest {

    @Test
    public void test1() {
        final MaximumUnitsOnATruck solution = new MaximumUnitsOnATruck();
        final int output = solution.maximumUnits(
            new int[][]{
                {1, 3},
                {2, 2},
                {3, 1}
            },
            4
        );

        Assert.assertEquals(8, output);
    }

    @Test
    public void test2() {
        final MaximumUnitsOnATruck solution = new MaximumUnitsOnATruck();
        final int output = solution.maximumUnits(
            new int[][]{
                {5, 10},
                {2, 5},
                {4, 7},
                {3, 9}
            },
            10
        );

        Assert.assertEquals(91, output);
    }
}
