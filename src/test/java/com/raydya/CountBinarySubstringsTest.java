package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CountBinarySubstringsTest {
    @Test
    public void test1() {
        final CountBinarySubstrings solution = new CountBinarySubstrings();
        final int output = solution.countBinarySubstrings("00110011");

        Assert.assertEquals(6, output);
    }

    @Test
    public void test2() {
        final CountBinarySubstrings solution = new CountBinarySubstrings();
        final int output = solution.countBinarySubstrings("10101");

        Assert.assertEquals(4, output);
    }
}
