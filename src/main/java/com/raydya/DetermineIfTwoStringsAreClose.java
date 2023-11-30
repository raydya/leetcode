package com.raydya;

import java.util.Arrays;

public class DetermineIfTwoStringsAreClose {

    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        final int[] w1 = new int[26];
        final int[] w2 = new int[26];

        for (int i = 0; i < word1.length(); i++) {
            final char c1 = word1.charAt(i);
            final char c2 = word2.charAt(i);

            w1[c1 - 'a']++;
            w2[c2 - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (w1[i] == 0 && w2[i] != 0 || w1[i] != 0 && w2[i] == 0) {
                return false;
            }
        }

        Arrays.sort(w1);
        Arrays.sort(w2);

        for (int i = 0; i < 26; i++) {
            if (w1[i] != w2[i]) {
                return false;
            }
        }

        return true;
    }

}
