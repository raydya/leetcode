package com.raydya;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        final int[] h = new int[64];

        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            final int i1 = c - 'A';
            h[i1]++;
        }

        boolean counted = false;

        int l = 0;

        for (final int x : h) {
            if (x == 0) continue;
            if (counted && x == 1) continue;
            final int i = x % 2;
            if (counted && i!= 0) {
                l += x - 1;
            } else {
                l += x;
                if (i != 0) {
                    counted = true;
                }
            }
        }

        return l;
    }
}
