package com.raydya.ethan.math;

import org.junit.Assert;
import org.junit.Test;

public class BinaryConverterTest {

    @Test
    public void test1() {
        final BinaryConverter solution = new BinaryConverter();
        final String output = solution.toBinary(5);

        Assert.assertEquals("101", output);
    }

    @Test
    public void test2() {
        final BinaryConverter solution = new BinaryConverter();
        final String output = solution.toBinary(9);

        Assert.assertEquals("1001", output);
    }

    @Test
    public void test3() {
        final BinaryConverter solution = new BinaryConverter();
        final String output = solution.toBinary(53);

        Assert.assertEquals("110101", output);
    }

    @Test
    public void test4() {
        final BinaryConverter solution = new BinaryConverter();
        final String output = solution.toBinary(255);

        Assert.assertEquals("11111111", output);
    }

    @Test
    public void test5() {
        final BinaryConverter solution = new BinaryConverter();
        final String output = solution.toBinary(65535);

        Assert.assertEquals("1111111111111111", output);
    }
}
