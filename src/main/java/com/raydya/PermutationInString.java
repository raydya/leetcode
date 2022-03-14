package com.raydya;

import java.util.Arrays;

public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {
        final int[] h = new int[26];

        final int l = s1.length();
        for (int i = 0; i < l; i++) {
            final char c = s1.charAt(i);
            h[c - 'a']++;
        }

        for (int i = 0; i <= s2.length() - l; i++) {
            final int[] t = new int[26];
            for (int j = i; j < i + l; j++) {
                t[s2.charAt(j) - 'a']++;
            }

            if (Arrays.equals(h, t)) {
                return true;
            }
        }

        return false;
    }
}
