package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromeTest {
    @Test
    public void test1() {
        final LongestPalindrome solution = new LongestPalindrome();
        final int longestPalindrome = solution.longestPalindrome("abccccdd");

        Assert.assertEquals(7, longestPalindrome);
    }

    @Test
    public void test2() {
        final LongestPalindrome solution = new LongestPalindrome();
        final int longestPalindrome = solution.longestPalindrome("a");

        Assert.assertEquals(1, longestPalindrome);
    }

    @Test
    public void test3() {
        final LongestPalindrome solution = new LongestPalindrome();
        final int longestPalindrome = solution.longestPalindrome("bb");

        Assert.assertEquals(2, longestPalindrome);
    }

    @Test
    public void test4() {
        final LongestPalindrome solution = new LongestPalindrome();
        final int longestPalindrome = solution.longestPalindrome("bananas");

        Assert.assertEquals(5, longestPalindrome);
    }

    @Test
    public void test5() {
        final LongestPalindrome solution = new LongestPalindrome();
        final int longestPalindrome = solution.longestPalindrome("AAAAAA");

        Assert.assertEquals(6, longestPalindrome);
    }

    @Test
    public void test6() {
        final LongestPalindrome solution = new LongestPalindrome();
        final int longestPalindrome = solution.longestPalindrome("aaaAaaaa");

        Assert.assertEquals(7, longestPalindrome);
    }

    @Test
    public void test7() {
        final LongestPalindrome solution = new LongestPalindrome();
        final int longestPalindrome = solution.longestPalindrome("zeusnilemacaronimaisanitratetartinasiaminoracamelinsuez");

        Assert.assertEquals(55, longestPalindrome);
    }

}
