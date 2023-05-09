package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfValidClockTimesTest {

    @Test
    public void test1() {
        final NumberOfValidClockTimes solution = new NumberOfValidClockTimes();
        final int output = solution.countTime("?5:00");

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final NumberOfValidClockTimes solution = new NumberOfValidClockTimes();
        final int output = solution.countTime("0?:0?");

        Assert.assertEquals(100, output);
    }

    @Test
    public void test3() {
        final NumberOfValidClockTimes solution = new NumberOfValidClockTimes();
        final int output = solution.countTime("??:??");

        Assert.assertEquals(1440, output);
    }
}
