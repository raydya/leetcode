package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinCostClimbingStairsTest {

    @Test
    public void test1() {
        final MinCostClimbingStairs solution = new MinCostClimbingStairs();
        final int output = solution.minCostClimbingStairs(new int[]{10, 15, 20});

        Assert.assertEquals(15, output);
    }

    @Test
    public void test2() {
        final MinCostClimbingStairs solution = new MinCostClimbingStairs();
        final int output = solution.minCostClimbingStairs(
            new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1});

        Assert.assertEquals(6, output);
    }
}
