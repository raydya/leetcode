package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class LatestTimeByReplacingHiddenDigitsTest {

    @Test
    public void test1() {
        final LatestTimeByReplacingHiddenDigits solution = new LatestTimeByReplacingHiddenDigits();
        final String output = solution.maximumTime("2?:?0");

        Assert.assertEquals("23:50", output);
    }

    @Test
    public void test2() {
        final LatestTimeByReplacingHiddenDigits solution = new LatestTimeByReplacingHiddenDigits();
        final String output = solution.maximumTime("0?:3?");

        Assert.assertEquals("09:39", output);
    }

    @Test
    public void test3() {
        final LatestTimeByReplacingHiddenDigits solution = new LatestTimeByReplacingHiddenDigits();
        final String output = solution.maximumTime("1?:22");

        Assert.assertEquals("19:22", output);
    }

    @Test
    public void test4() {
        final LatestTimeByReplacingHiddenDigits solution = new LatestTimeByReplacingHiddenDigits();
        final String output = solution.maximumTime("?4:03");

        Assert.assertEquals("14:03", output);
    }

    @Test
    public void test5() {
        final LatestTimeByReplacingHiddenDigits solution = new LatestTimeByReplacingHiddenDigits();
        final String output = solution.maximumTime("?0:15");

        Assert.assertEquals("20:15", output);
    }

    @Test
    public void test6() {
        final LatestTimeByReplacingHiddenDigits solution = new LatestTimeByReplacingHiddenDigits();
        final String output = solution.maximumTime("??:3?");

        Assert.assertEquals("23:39", output);
    }
}
