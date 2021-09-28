package com.raydya;

public class BuddyStrings {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;

        int diffCnt = 0;
        final char[] chars = new char[4];
        boolean dupChar = false;
        final int[] h1 = new int[26];
        for (int i = 0; i < s.length(); i++) {
            final char c1 = s.charAt(i);
            final char c2 = goal.charAt(i);
            if (c1 != c2) {
                diffCnt++;
                if (diffCnt > 2) return false;
                chars[diffCnt - 1] = c1;
                chars[diffCnt + 1] = c2;
            }

            if (!dupChar) {
                final int k1 = c1 - 'a';
                h1[k1]++;

                if (h1[k1] > 1) dupChar = true;
            }
        }

        return (diffCnt == 2 && chars[0] == chars[3] && chars[1] == chars[2]) || (diffCnt == 0 && dupChar);
    }
}
