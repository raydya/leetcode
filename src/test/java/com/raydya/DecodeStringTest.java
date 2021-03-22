package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class DecodeStringTest {
    @Test
    public void test1() {
        final DecodeString solution = new DecodeString();
        final String output = solution.decodeString("3[a]2[bc]");

        Assert.assertEquals("aaabcbc", output);
    }

    @Test
    public void test2() {
        final DecodeString solution = new DecodeString();
        final String output = solution.decodeString("3[a2[c]]");

        Assert.assertEquals("accaccacc", output);
    }

    @Test
    public void test3() {
        final DecodeString solution = new DecodeString();
        final String output = solution.decodeString("2[abc]3[cd]ef");

        Assert.assertEquals("abcabccdcdcdef", output);
    }

    @Test
    public void test4() {
        final DecodeString solution = new DecodeString();
        final String output = solution.decodeString("abc3[cd]xyz");

        Assert.assertEquals("abccdcdcdxyz", output);
    }
}
