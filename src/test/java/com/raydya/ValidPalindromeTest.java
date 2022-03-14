package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ValidPalindromeTest {

    @Test
    public void test1() {
        final ValidPalindrome solution = new ValidPalindrome();
        final boolean isPalindrome = solution.isPalindrome("A man, a plan, a canal: Panama");

        Assert.assertTrue(isPalindrome);
    }

    @Test
    public void test2() {
        final ValidPalindrome solution = new ValidPalindrome();
        final boolean isPalindrome = solution.isPalindrome("race a car");

        Assert.assertFalse(isPalindrome);
    }
}
