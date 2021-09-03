package com.raydya;

public class NumberOfLinesToWriteString {
    public int[] numberOfLines(int[] widths, String s) {
        int r = 1;
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            final int k = c - 'a';
            l += widths[k];
            if (l > 100) {
                r++;
                l = widths[k];
            }
        }

        return new int[]{r, l};
    }
}
