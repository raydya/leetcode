package com.raydya;

public class DiStringMatch {
    public int[] diStringMatch(String s) {
        final int n = s.length();
        final int[] ret = new int[n + 1];
        int l = 0;
        int h = n;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                ret[i] = l++;
            } else {
                ret[i] = h--;
            }
        }

        ret[n] = l;
        return ret;
    }
}
