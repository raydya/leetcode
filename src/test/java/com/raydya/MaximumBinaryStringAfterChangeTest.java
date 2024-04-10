package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MaximumBinaryStringAfterChangeTest {

    @Test
    public void test1() {
        final MaximumBinaryStringAfterChange solution = new MaximumBinaryStringAfterChange();
        final String output = solution.maximumBinaryString("000110");

        Assert.assertEquals("111011", output);
    }

    @Test
    public void test2() {
        final MaximumBinaryStringAfterChange solution = new MaximumBinaryStringAfterChange();
        final String output = solution.maximumBinaryString("01");

        Assert.assertEquals("01", output);
    }

    @Test
    public void test3() {
        final MaximumBinaryStringAfterChange solution = new MaximumBinaryStringAfterChange();
        final String output = solution.maximumBinaryString("01111001100000110010");

        Assert.assertEquals("11111111110111111111", output);
    }
}
