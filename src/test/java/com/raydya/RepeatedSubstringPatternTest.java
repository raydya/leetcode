package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class RepeatedSubstringPatternTest {

    @Test
    public void test1() {
        final RepeatedSubStringPattern solution = new RepeatedSubStringPattern();
        final boolean output = solution.repeatedSubstringPattern("abab");

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final RepeatedSubStringPattern solution = new RepeatedSubStringPattern();
        final boolean output = solution.repeatedSubstringPattern("aba");

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final RepeatedSubStringPattern solution = new RepeatedSubStringPattern();
        final boolean output = solution.repeatedSubstringPattern("abcabcabcabc");

        Assert.assertTrue(output);
    }
}
