package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class CircularSentenceTest {

    @Test
    public void test1() {
        final CircularSentence solution = new CircularSentence();
        final boolean output = solution.isCircularSentence("leetcode exercises sound delightful");

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final CircularSentence solution = new CircularSentence();
        final boolean output = solution.isCircularSentence("eetcode");

        Assert.assertTrue(output);
    }

    @Test
    public void test3() {
        final CircularSentence solution = new CircularSentence();
        final boolean output = solution.isCircularSentence("Leetcode is cool");

        Assert.assertFalse(output);
    }

    @Test
    public void test4() {
        final CircularSentence solution = new CircularSentence();
        final boolean output = solution.isCircularSentence("Leetcode eisc cool");

        Assert.assertFalse(output);
    }
}
