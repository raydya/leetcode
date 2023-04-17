package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CountDaysSpentTogetherTest {

    @Test
    public void test1() {
        final CountDaysSpentTogether solution = new CountDaysSpentTogether();
        final int output = solution.countDaysTogether("08-15", "08-18", "08-16", "08-19");

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final CountDaysSpentTogether solution = new CountDaysSpentTogether();
        final int output = solution.countDaysTogether("10-01", "10-31", "11-01", "12-31");

        Assert.assertEquals(0, output);
    }
}
