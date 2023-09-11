package com.raydya;

public class CheckWhetherTwoStringsAreAlmostEquivalent {

    public boolean checkAlmostEquivalent(String word1, String word2) {
        final int[] h = new int[26];

        for (int i = 0; i < word1.length(); i++) {
            final char c = word1.charAt(i);
            final int k = c - 'a';
            h[k]++;
        }

        for (int i = 0; i < word2.length(); i++) {
            final char c = word2.charAt(i);
            final int k = c - 'a';
            h[k]--;
        }

        for (int i = 0; i < 26; i++) {
            if (Math.abs(h[i]) > 3) {
                return false;
            }
        }

        return true;
    }

}
