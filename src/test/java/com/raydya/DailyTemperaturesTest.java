package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class DailyTemperaturesTest {

    @Test
    public void test1() {
        final DailyTemperatures solution = new DailyTemperatures();
        final int[] output = solution.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});

        Assert.assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0}, output);
    }
}
