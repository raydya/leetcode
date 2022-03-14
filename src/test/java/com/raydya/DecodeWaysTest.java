package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class DecodeWaysTest {

    @Test
    public void test1() {
        final DecodeWays solution = new DecodeWays();
        final int output = solution.numDecodings("12");

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final DecodeWays solution = new DecodeWays();
        final int output = solution.numDecodings("226");

        Assert.assertEquals(3, output);
    }

    @Test
    public void test3() {
        final DecodeWays solution = new DecodeWays();
        final int output = solution.numDecodings("0");

        Assert.assertEquals(0, output);
    }

    @Test
    public void test4() {
        final DecodeWays solution = new DecodeWays();
        final int output = solution.numDecodings("1234");

        Assert.assertEquals(3, output);
    }
}
