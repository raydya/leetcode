package com.raydya;

public class MinimumBitFlipsToConvertNumber {

    public int minBitFlips(int start, int goal) {
        final String o = Integer.toBinaryString(start);
        final String t = Integer.toBinaryString(goal);

        int count = 0;

        final int l = Math.max(o.length(), t.length());

        for (int i = 0; i < l; i++) {
            final int k = o.length() - i - 1;
            final int j = t.length() - i - 1;
            final char m = i < o.length() ? o.charAt(k) : '0';
            final char n = i < t.length() ? t.charAt(j) : '0';
            if (m != n) {
                count++;
            }
        }

        return count;
    }

}
