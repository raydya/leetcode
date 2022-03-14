package com.raydya;

import java.util.Objects;

public class CheckIfOneStringSwapCanMakeStringsEqual {

    public boolean areAlmostEqual(String s1, String s2) {
        if (Objects.equals(s1, s2)) {
            return true;
        }
        if (s1.length() != s2.length()) {
            return false;
        }
        int falseCnt = 0;
        final int[] h = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            final char c1 = s1.charAt(i);
            final char c2 = s2.charAt(i);
            h[c1 - 'a']++;
            h[c2 - 'a']--;
            if (c1 != c2) {
                falseCnt++;
            }
        }

        for (final int j : h) {
            if (j != 0) {
                return false;
            }
        }

        return falseCnt == 2;
    }
}
