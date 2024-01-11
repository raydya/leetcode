package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MinimumAdditionsToMakeValidStringTest {

    @Test
    public void test1() {
        final MinimumAdditionsToMakeValidString solution = new MinimumAdditionsToMakeValidString();
        final int output = solution.addMinimum("b");

        Assert.assertEquals(2, output);
    }

    @Test
    public void test2() {
        final MinimumAdditionsToMakeValidString solution = new MinimumAdditionsToMakeValidString();
        final int output = solution.addMinimum("aaa");

        Assert.assertEquals(6, output);
    }

    @Test
    public void test3() {
        final MinimumAdditionsToMakeValidString solution = new MinimumAdditionsToMakeValidString();
        final int output = solution.addMinimum("abc");

        Assert.assertEquals(0, output);
    }

    @Test
    public void test4() {
        final MinimumAdditionsToMakeValidString solution = new MinimumAdditionsToMakeValidString();
        final int output = solution.addMinimum("aabbcc");

        Assert.assertEquals(6, output);
    }

    @Test
    public void test5() {
        final MinimumAdditionsToMakeValidString solution = new MinimumAdditionsToMakeValidString();
        final int output = solution.addMinimum("aba");

        Assert.assertEquals(3, output);
    }
}
