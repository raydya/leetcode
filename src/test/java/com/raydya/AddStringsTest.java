package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class AddStringsTest {

    @Test
    public void test1() {
        final AddStrings solution = new AddStrings();
        final String s = solution.addStrings("100", "205");

        Assert.assertEquals("305", s);
    }

    @Test
    public void test2() {
        final AddStrings solution = new AddStrings();
        final String s = solution.addStrings("196", "205");

        Assert.assertEquals("401", s);
    }

    @Test
    public void test3() {
        final AddStrings solution = new AddStrings();
        final String s = solution.addStrings("1", "9");

        Assert.assertEquals("10", s);
    }

    @Test
    public void test4() {
        final AddStrings solution = new AddStrings();
        final String s = solution.addStrings("9", "99");

        Assert.assertEquals("108", s);
    }
}
