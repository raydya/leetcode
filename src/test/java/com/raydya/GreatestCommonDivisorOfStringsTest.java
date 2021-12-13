package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class GreatestCommonDivisorOfStringsTest {
    @Test
    public void test1() {
        final GreatestCommonDivisorOfStrings solution = new GreatestCommonDivisorOfStrings();
        final String output = solution.gcdOfStrings("ABCABC", "ABC");

        Assert.assertEquals("ABC", output);
    }

    @Test
    public void test2() {
        final GreatestCommonDivisorOfStrings solution = new GreatestCommonDivisorOfStrings();
        final String output = solution.gcdOfStrings("ABABAB", "ABAB");

        Assert.assertEquals("AB", output);
    }

    @Test
    public void test3() {
        final GreatestCommonDivisorOfStrings solution = new GreatestCommonDivisorOfStrings();
        final String output = solution.gcdOfStrings("LEET", "CODE");

        Assert.assertEquals("", output);
    }

    @Test
    public void test4() {
        final GreatestCommonDivisorOfStrings solution = new GreatestCommonDivisorOfStrings();
        final String output = solution.gcdOfStrings("ABCDEF", "ABC");

        Assert.assertEquals("", output);
    }

    @Test
    public void test5() {
        final GreatestCommonDivisorOfStrings solution = new GreatestCommonDivisorOfStrings();
        final String output = solution.gcdOfStrings("ABABABAB", "ABAB");

        Assert.assertEquals("ABAB", output);
    }
}
