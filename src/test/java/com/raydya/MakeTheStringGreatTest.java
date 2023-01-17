package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MakeTheStringGreatTest {

    @Test
    public void test1() {
        final MakeTheStringGreat solution = new MakeTheStringGreat();
        final String output = solution.makeGood("leEeetcode");

        Assert.assertEquals("leetcode", output);
    }

    @Test
    public void test2() {
        final MakeTheStringGreat solution = new MakeTheStringGreat();
        final String output = solution.makeGood("abBAcC");

        Assert.assertEquals("", output);
    }

    @Test
    public void test3() {
        final MakeTheStringGreat solution = new MakeTheStringGreat();
        final String output = solution.makeGood("s");

        Assert.assertEquals("s", output);
    }

    @Test
    public void test4() {
        final MakeTheStringGreat solution = new MakeTheStringGreat();
        final String output = solution.makeGood("Pp");

        Assert.assertEquals("", output);
    }
}
