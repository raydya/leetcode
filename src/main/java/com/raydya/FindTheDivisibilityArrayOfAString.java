package com.raydya;

public class FindTheDivisibilityArrayOfAString {

    public int[] divisibilityArray(String word, int m) {
        final int[] ret = new int[word.length()];
        long sum = 0;
        for (int i = 0; i < word.length(); i++) {
            final char c = word.charAt(i);
            final int v = c - '0';
            sum = (sum * 10 + v) % m;
            ret[i] = sum == 0 ? 1 : 0;
        }
        return ret;
    }

}
