package com.raydya;

public class RearrangeCharactersToMakeTargetString {

    public int rearrangeCharacters(String s, String target) {
        int[] h1 = new int[26];

        for (int i = 0; i < target.length(); i++) {
            final int c = target.charAt(i) - 'a';
            h1[c]++;
        }

        int[] h2 = new int[26];
        for (int i = 0; i < s.length(); i++) {
            final int c = s.charAt(i) - 'a';
            h2[c]++;
        }

        int c = Integer.MAX_VALUE;
        for (int i = 0; i < h1.length; i++) {
            if (h1[i] == 0) {
                continue;
            }
            c = Math.min(c, h2[i] / h1[i]);
        }

        return c;
    }
}
