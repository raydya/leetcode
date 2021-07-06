package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ValidPalindromeIITest {
    @Test
    public void test1() {
        final ValidPalindromeII solution = new ValidPalindromeII();
        final boolean output = solution.validPalindrome("aba");

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final ValidPalindromeII solution = new ValidPalindromeII();
        final boolean output = solution.validPalindrome("abca");

        Assert.assertTrue(output);
    }

    @Test
    public void test3() {
        final ValidPalindromeII solution = new ValidPalindromeII();
        final boolean output = solution.validPalindrome("deeee");

        Assert.assertTrue(output);
    }

    @Test
    public void test4() {
        final ValidPalindromeII solution = new ValidPalindromeII();
        final boolean output = solution.validPalindrome("cbbcc");

        Assert.assertTrue(output);
    }

    @Test
    public void test5() {
        final ValidPalindromeII solution = new ValidPalindromeII();
        final boolean output = solution.validPalindrome("abc");

        Assert.assertFalse(output);
    }

    @Test
    public void test6() {
        final ValidPalindromeII solution = new ValidPalindromeII();
        final boolean output = solution.validPalindrome("tebbem");

        Assert.assertFalse(output);
    }

    @Test
    public void test7() {
        final ValidPalindromeII solution = new ValidPalindromeII();
        final boolean output = solution.validPalindrome("yd");

        Assert.assertTrue(output);
    }
}
