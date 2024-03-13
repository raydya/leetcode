package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MaximumOddBinaryNumberTest {

    @Test
    public void test1() {
        final MaximumOddBinaryNumber solution = new MaximumOddBinaryNumber();
        final String output = solution.maximumOddBinaryNumber("010");

        Assert.assertEquals("001", output);
    }

    @Test
    public void test2() {
        final MaximumOddBinaryNumber solution = new MaximumOddBinaryNumber();
        final String output = solution.maximumOddBinaryNumber("0101");

        Assert.assertEquals("1001", output);
    }
}
