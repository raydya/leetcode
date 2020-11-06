package com.raydya;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int[] h = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            h[c]++;
            int d = t.charAt(i) - 'a';
            h[d]--;
        }

        final int e = t.charAt(t.length() - 1) - 'a';
        h[e]--;

        for (int i = 0; i < h.length; i++) {
            if (h[i] == -1) {
                return (char) (i + 'a');
            }
        }

        return 'a';
    }
}
