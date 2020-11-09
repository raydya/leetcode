package com.raydya;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        final int[] h = new int[128];

        for (final char c : s.toCharArray()) {
            h[c]++;
        }

        int l = 0;

        for (final int x : h) {
            l += x / 2 * 2;
            if (l % 2 == 0 && x % 2 == 1) {
                l += 1;
            }
        }

        return l;
    }
}
