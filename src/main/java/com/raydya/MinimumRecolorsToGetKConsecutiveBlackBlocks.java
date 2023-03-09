package com.raydya;

public class MinimumRecolorsToGetKConsecutiveBlackBlocks {

    public int minimumRecolors(String blocks, int k) {
        int r = Integer.MAX_VALUE;
        for (int i = 0; i < blocks.length() - k + 1; i++) {
            int m = 0;
            for (int j = i; j < i + k; j++) {
                final char c = blocks.charAt(j);
                if (c == 'W') {
                    m++;
                }
            }
            r = Math.min(m, r);
        }
        return r;
    }

}
