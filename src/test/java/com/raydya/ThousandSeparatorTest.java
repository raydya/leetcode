package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ThousandSeparatorTest {

    @Test
    public void test1() {
        final ThousandSeparator solution = new ThousandSeparator();
        final String output = solution.thousandSeparator(987);

        Assert.assertEquals("987", output);
    }

    @Test
    public void test2() {
        final ThousandSeparator solution = new ThousandSeparator();
        final String output = solution.thousandSeparator(1234);

        Assert.assertEquals("1.234", output);
    }

    @Test
    public void test3() {
        final ThousandSeparator solution = new ThousandSeparator();
        final String output = solution.thousandSeparator(123456789);

        Assert.assertEquals("123.456.789", output);
    }

    @Test
    public void test4() {
        final ThousandSeparator solution = new ThousandSeparator();
        final String output = solution.thousandSeparator(0);

        Assert.assertEquals("0", output);
    }

    @Test
    public void test5() {
        final ThousandSeparator solution = new ThousandSeparator();
        final String output = solution.thousandSeparator(51040);

        Assert.assertEquals("51.040", output);
    }
}
