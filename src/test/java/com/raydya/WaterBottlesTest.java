package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class WaterBottlesTest {
    @Test
    public void test1() {
        final WaterBottles solution = new WaterBottles();
        final int output = solution.numWaterBottles(9, 3);

        Assert.assertEquals(13, output);
    }

    @Test
    public void test2() {
        final WaterBottles solution = new WaterBottles();
        final int output = solution.numWaterBottles(15, 4);

        Assert.assertEquals(19, output);
    }

    @Test
    public void test3() {
        final WaterBottles solution = new WaterBottles();
        final int output = solution.numWaterBottles(5, 5);

        Assert.assertEquals(6, output);
    }

    @Test
    public void test4() {
        final WaterBottles solution = new WaterBottles();
        final int output = solution.numWaterBottles(2, 3);

        Assert.assertEquals(2, output);
    }
}
