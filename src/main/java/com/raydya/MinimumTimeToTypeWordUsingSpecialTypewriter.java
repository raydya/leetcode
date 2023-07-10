package com.raydya;

public class MinimumTimeToTypeWordUsingSpecialTypewriter {

    public int minTimeToType(String word) {
        int cnt = 0;
        int p = 0;
        for (int i = 0; i < word.length(); i++) {
            final char c = word.charAt(i);
            final int k = c - 'a';
            if (p != k) {
                final int p1 = Math.abs(k - p);
                final int p2 = Math.abs(p + 26 - k);
                final int p3 = Math.abs(26 - p + k);
                cnt += Math.min(Math.min(p1, p2), p3);
            }
            cnt++;
            p = k;
        }

        return cnt;
    }

}
