package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class DetectCapitalTest {

    @Test
    public void test1() {
        final DetectCapital solution = new DetectCapital();
        final boolean output = solution.detectCapitalUse("USA");

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final DetectCapital solution = new DetectCapital();
        final boolean output = solution.detectCapitalUse("FlaG");

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final DetectCapital solution = new DetectCapital();
        final boolean output = solution.detectCapitalUse("Google");

        Assert.assertTrue(output);
    }

    @Test
    public void test4() {
        final DetectCapital solution = new DetectCapital();
        final boolean output = solution.detectCapitalUse("leetcode");

        Assert.assertTrue(output);
    }
}
