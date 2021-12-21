package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class DayOfTheYearTest {
    @Test
    public void test1() {
        final DayOfTheYear solution = new DayOfTheYear();
        final int output = solution.dayOfYear("2019-01-09");

        Assert.assertEquals(9, output);
    }

    @Test
    public void test2() {
        final DayOfTheYear solution = new DayOfTheYear();
        final int output = solution.dayOfYear("2019-02-10");

        Assert.assertEquals(41, output);
    }

    @Test
    public void test3() {
        final DayOfTheYear solution = new DayOfTheYear();
        final int output = solution.dayOfYear("2003-03-01");

        Assert.assertEquals(60, output);
    }

    @Test
    public void test4() {
        final DayOfTheYear solution = new DayOfTheYear();
        final int output = solution.dayOfYear("2004-03-01");

        Assert.assertEquals(61, output);
    }

    @Test
    public void test5() {
        final DayOfTheYear solution = new DayOfTheYear();
        final int output = solution.dayOfYear("2000-12-04");

        Assert.assertEquals(339, output);
    }
}
