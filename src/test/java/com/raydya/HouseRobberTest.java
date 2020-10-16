package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class HouseRobberTest {
    @Test
    public void test1() {
        final HouseRobber solution = new HouseRobber();
        final int amount = solution.rob(new int[]{1, 2, 3, 1});

        Assert.assertEquals(4, amount);
    }

    @Test
    public void test2() {
        final HouseRobber solution = new HouseRobber();
        final int amount = solution.rob(new int[]{2, 7, 9, 3, 1});

        Assert.assertEquals(12, amount);
    }

    @Test
    public void test3() {
        final HouseRobber solution = new HouseRobber();
        final int amount = solution.rob(new int[]{2, 1, 1, 2});

        Assert.assertEquals(4, amount);
    }
}
