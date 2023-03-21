package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ConvertTheTemperatureTest {

    @Test
    public void test1() {
        final ConvertTheTemperature solution = new ConvertTheTemperature();
        final double[] output = solution.convertTemperature(36.50);

        Assert.assertArrayEquals(
            new double[]{
                309.65000, 97.70000
            },
            output, 0
        );
    }

    @Test
    public void test2() {
        final ConvertTheTemperature solution = new ConvertTheTemperature();
        final double[] output = solution.convertTemperature(122.11);

        Assert.assertArrayEquals(
            new double[]{
                395.26000, 251.79800
            },
            output, 0
        );
    }
}
