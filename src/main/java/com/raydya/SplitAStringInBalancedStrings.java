package com.raydya;

public class SplitAStringInBalancedStrings {
    public int balancedStringSplit(String s) {
        int cnt = 0;
        final int[] h = new int[2];

        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            if (c == 'L') {
                h[0]++;
            } else {
                h[1]++;
            }

            if (h[0] == h[1]) {
                cnt++;
                h[0] = 0;
                h[1] = 0;
            }
        }

        return cnt;
    }
}
