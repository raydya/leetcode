package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfDaysBetweenTwoDatesTest {
    @Test
    public void test1() {
        final NumberOfDaysBetweenTwoDates solution = new NumberOfDaysBetweenTwoDates();
        final int output = solution.daysBetweenDates("2019-06-29", "2019-06-30");

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final NumberOfDaysBetweenTwoDates solution = new NumberOfDaysBetweenTwoDates();
        final int output = solution.daysBetweenDates("2020-01-15", "2019-12-31");

        Assert.assertEquals(15, output);
    }
}
