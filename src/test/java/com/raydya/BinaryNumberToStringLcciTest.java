package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class BinaryNumberToStringLcciTest {

    @Test
    public void test1() {
        final BinaryNumberToStringLcci solution = new BinaryNumberToStringLcci();
        final String output = solution.printBin(0.625);

        Assert.assertEquals("0.101", output);
    }

    @Test
    public void test2() {
        final BinaryNumberToStringLcci solution = new BinaryNumberToStringLcci();
        final String output = solution.printBin(0.1);

        Assert.assertEquals("ERROR", output);
    }

    @Test
    public void test3() {
        final BinaryNumberToStringLcci solution = new BinaryNumberToStringLcci();
        final String output = solution.printBin(0.078125);

        Assert.assertEquals("0.000101", output);
    }
}
