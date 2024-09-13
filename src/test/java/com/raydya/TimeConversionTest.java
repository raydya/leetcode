package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class TimeConversionTest {

    @Test
    public void test1() {
        final TimeConversion solution = new TimeConversion();
        final String output = solution.timeConversion("07:05:45PM");

        Assert.assertEquals("19:05:45", output);
    }

    @Test
    public void test2() {
        final TimeConversion solution = new TimeConversion();
        final String output = solution.timeConversion("12:40:22AM");

        Assert.assertEquals("00:40:22", output);
    }

    @Test
    public void test3() {
        final TimeConversion solution = new TimeConversion();
        final String output = solution.timeConversion("12:45:54PM");

        Assert.assertEquals("12:45:54", output);
    }
}
