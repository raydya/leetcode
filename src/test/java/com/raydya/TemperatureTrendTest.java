package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class TemperatureTrendTest {

    @Test
    public void test1() {
        final TemperatureTrend solution = new TemperatureTrend();
        final int output = solution.temperatureTrend(
            new int[]{21, 18, 18, 18, 31},
            new int[]{34, 32, 16, 16, 17}
        );

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final TemperatureTrend solution = new TemperatureTrend();
        final int output = solution.temperatureTrend(
            new int[]{5, 10, 16, -6, 15, 11, 3},
            new int[]{16, 22, 23, 23, 25, 3, -16}
        );

        Assert.assertEquals(3, output);
    }
}
