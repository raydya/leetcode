package com.raydya;

public class SubstringsOfSizeThreeWithDistinctCharacters {

    public int countGoodsSubstrings(String s) {
        int t = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            final int[] h = new int[26];
            boolean f = true;
            for (int j = 0; j < 3; j++) {
                final char c = s.charAt(i + j);
                final int p = c - 'a';
                h[p]++;

                if (h[p] > 1) {
                    f = false;
                }
            }
            if (f) {
                t++;
            }
        }
        return t;
    }

}
