package com.raydya;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {

    public boolean areOccurrencesEqual(String s) {
        final int[] alphabets = new int[26];

        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            final int idx = c - 'a';
            alphabets[idx]++;
            cnt = alphabets[idx];
        }

        for (final int alphabet : alphabets) {
            if (alphabet == 0) {
                continue;
            }
            if (alphabet != cnt) {
                return false;
            }
        }

        return true;
    }

}
