package com.raydya;

public class AlternatingDigitSum {

    public int alternateDigitSum(int n) {
        int t = 0;
        final String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            final int v = c - '0';
            final int r = i % 2;
            if (r == 0) {
                t += v;
            } else {
                t -= v;
            }
        }

        return t;
    }

}
