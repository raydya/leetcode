package com.raydya;

public class BinaryGap {

    public int binaryGap(int n) {
        final String s = Integer.toBinaryString(n);

        int gap = 0;
        int p = -1;

        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            if (c == '1') {
                if (p != -1) {
                    gap = Math.max(gap, i - p);
                }
                p = i;
            }
        }

        return gap;
    }
}
