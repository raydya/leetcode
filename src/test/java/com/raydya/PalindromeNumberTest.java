package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberTest {

    @Test
    public void test1() {
        int input = 121;

        final PalindromeNumber palindromeNumber = new PalindromeNumber();
        final boolean output = palindromeNumber.isPalindrome(input);

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        int input = -121;

        final PalindromeNumber palindromeNumber = new PalindromeNumber();
        final boolean output = palindromeNumber.isPalindrome(input);

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        int input = 10;

        final PalindromeNumber palindromeNumber = new PalindromeNumber();
        final boolean output = palindromeNumber.isPalindrome(input);

        Assert.assertFalse(output);
    }
}
