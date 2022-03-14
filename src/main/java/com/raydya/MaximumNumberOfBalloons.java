package com.raydya;

public class MaximumNumberOfBalloons {

    public int maxNumberOfBalloons(String text) {
        int[] alphabets = new int[26];

        for (int i = 0; i < text.length(); i++) {
            final char c = text.charAt(i);
            alphabets[c - 'a']++;
        }

        int ans = 0;
        final int b = 'b' - 'a';
        final int a = 0;
        final int l = 'l' - 'a';
        final int o = 'o' - 'a';
        final int n = 'n' - 'a';
        while (true) {
            alphabets[b]--;
            alphabets[a]--;
            alphabets[l] -= 2;
            alphabets[o] -= 2;
            alphabets[n]--;
            if (alphabets[b] >= 0
                && alphabets[a] >= 0
                && alphabets[l] >= 0
                && alphabets[o] >= 0
                && alphabets[n] >= 0) {
                ans++;
            } else {
                break;
            }
        }

        return ans;
    }
}
