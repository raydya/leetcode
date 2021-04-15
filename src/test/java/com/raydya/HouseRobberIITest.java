package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class HouseRobberIITest {
    @Test
    public void test1() {
        final HouseRobberII solution = new HouseRobberII();
        final int output = solution.rob(new int[]{2, 3, 2});

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final HouseRobberII solution = new HouseRobberII();
        final int output = solution.rob(new int[]{1, 2, 3, 1});

        Assert.assertEquals(4, output);
    }

    @Test
    public void test3() {
        final HouseRobberII solution = new HouseRobberII();
        final int output = solution.rob(new int[]{0});

        Assert.assertEquals(0, output);
    }
}
