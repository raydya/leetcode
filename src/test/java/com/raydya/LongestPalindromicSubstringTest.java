package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromicSubstringTest {
    @Test
    public void test1() {
        final LongestPalindromicSubstring solution = new LongestPalindromicSubstring();
        final String longestPalindrome = solution.longestPalindrome("babad");

        Assert.assertEquals("aba", longestPalindrome);
    }

    @Test
    public void test2() {
        final LongestPalindromicSubstring solution = new LongestPalindromicSubstring();
        final String longestPalindrome = solution.longestPalindrome("cbbd");

        Assert.assertEquals("bb", longestPalindrome);
    }

    @Test
    public void test3() {
        final LongestPalindromicSubstring solution = new LongestPalindromicSubstring();
        final String longestPalindrome = solution.longestPalindrome("a");

        Assert.assertEquals("a", longestPalindrome);
    }

    @Test
    public void test4() {
        final LongestPalindromicSubstring solution = new LongestPalindromicSubstring();
        final String longestPalindrome = solution.longestPalindrome("ac");

        Assert.assertEquals("c", longestPalindrome);
    }

    @Test
    public void test5() {
        final LongestPalindromicSubstring solution = new LongestPalindromicSubstring();
        final String longestPalindrome = solution.longestPalindrome("bb");

        Assert.assertEquals("bb", longestPalindrome);
    }

    @Test
    public void test6() {
        final LongestPalindromicSubstring solution = new LongestPalindromicSubstring();
        final String longestPalindrome = solution.longestPalindrome("abb");

        Assert.assertEquals("bb", longestPalindrome);
    }
}
