package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CalculateDelayedArrivalTimeTest {

    @Test
    public void test1() {
        final CalculateDelayedArrivalTime solution = new CalculateDelayedArrivalTime();
        final int output = solution.findDelayedArrivalTime(15, 5);

        Assert.assertEquals(20, output);
    }

    @Test
    public void test2() {
        final CalculateDelayedArrivalTime solution = new CalculateDelayedArrivalTime();
        final int output = solution.findDelayedArrivalTime(13, 11);

        Assert.assertEquals(0, output);
    }
}
