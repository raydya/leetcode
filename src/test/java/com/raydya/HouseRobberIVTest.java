package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class HouseRobberIVTest {

    @Test
    public void test1() {
        final HouseRobberIV solution = new HouseRobberIV();
        final int output = solution.minCapability(new int[]{2, 3, 5, 9}, 2);

        Assert.assertEquals(5, output);
    }

    @Test
    public void test2() {
        final HouseRobberIV solution = new HouseRobberIV();
        final int output = solution.minCapability(new int[]{2, 7, 9, 3, 1}, 2);

        Assert.assertEquals(2, output);
    }
}
