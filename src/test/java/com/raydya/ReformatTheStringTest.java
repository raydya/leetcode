package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ReformatTheStringTest {

    @Test
    public void test1() {
        final ReformatTheString solution = new ReformatTheString();
        final String output = solution.reformat("a0b1c2");

        Assert.assertEquals("0a1b2c", output);
    }

    @Test
    public void test2() {
        final ReformatTheString solution = new ReformatTheString();
        final String output = solution.reformat("leetcode");

        Assert.assertEquals("", output);
    }

    @Test
    public void test3() {
        final ReformatTheString solution = new ReformatTheString();
        final String output = solution.reformat("1229857369");

        Assert.assertEquals("", output);
    }

    @Test
    public void test4() {
        final ReformatTheString solution = new ReformatTheString();
        final String output = solution.reformat("covid2019");

        Assert.assertEquals("c2o0v1i9d", output);
    }

    @Test
    public void test5() {
        final ReformatTheString solution = new ReformatTheString();
        final String output = solution.reformat("j");

        Assert.assertEquals("j", output);
    }
}
