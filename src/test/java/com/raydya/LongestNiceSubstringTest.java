package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class LongestNiceSubstringTest {

    @Test
    public void test1() {
        final LongestNiceSubstring solution = new LongestNiceSubstring();
        final String output = solution.longestNiceSubstring("YazaAay");

        Assert.assertEquals("aAa", output);
    }

    @Test
    public void test2() {
        final LongestNiceSubstring solution = new LongestNiceSubstring();
        final String output = solution.longestNiceSubstring("Bb");

        Assert.assertEquals("Bb", output);
    }

    @Test
    public void test3() {
        final LongestNiceSubstring solution = new LongestNiceSubstring();
        final String output = solution.longestNiceSubstring("c");

        Assert.assertEquals("", output);
    }

    @Test
    public void test4() {
        final LongestNiceSubstring solution = new LongestNiceSubstring();
        final String output = solution.longestNiceSubstring("dDzeE");

        Assert.assertEquals("dD", output);
    }
}
