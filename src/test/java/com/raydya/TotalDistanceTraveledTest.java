package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class TotalDistanceTraveledTest {

    @Test
    public void test1() {
        final TotalDistanceTraveled solution = new TotalDistanceTraveled();
        final int output = solution.distanceTraveled(5, 10);

        Assert.assertEquals(60, output);
    }

    @Test
    public void test2() {
        final TotalDistanceTraveled solution = new TotalDistanceTraveled();
        final int output = solution.distanceTraveled(1, 2);

        Assert.assertEquals(10, output);
    }
}
