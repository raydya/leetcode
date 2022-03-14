package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class DayOfTheWeekTest {

    @Test
    public void test1() {
        final DayOfTheWeek solution = new DayOfTheWeek();
        final String output = solution.dayOfTheWeek(31, 8, 2019);

        Assert.assertEquals("Saturday", output);
    }

    @Test
    public void test2() {
        final DayOfTheWeek solution = new DayOfTheWeek();
        final String output = solution.dayOfTheWeek(18, 7, 1999);

        Assert.assertEquals("Sunday", output);
    }

    @Test
    public void test3() {
        final DayOfTheWeek solution = new DayOfTheWeek();
        final String output = solution.dayOfTheWeek(15, 8, 1993);

        Assert.assertEquals("Sunday", output);
    }

    @Test
    public void test4() {
        final DayOfTheWeek solution = new DayOfTheWeek();
        final String output = solution.dayOfTheWeek(31, 8, 2100);

        Assert.assertEquals("Tuesday", output);
    }
}
