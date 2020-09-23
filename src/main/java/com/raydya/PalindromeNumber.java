package com.raydya;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int origin = x;
        long reversed = 0;

        while (x != 0) {
            final int d = x % 10;
            reversed = reversed * 10 + d;
            x = x / 10;
        }

        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return false;
        }

        return reversed == origin;
    }
}
