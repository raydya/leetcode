package com.raydya;

public class ReverseStringII {
    private char[] chars;

    public String reverseStr(String s, int k) {
        chars = s.toCharArray();
        final int step = (int) Math.ceil(s.length() / (2.0 * k));

        for (int i = 0; i < step; i++) {
            final int m = i * 2 * k;
            reverse(m, m + k);
        }

        return String.valueOf(chars);
    }

    private void reverse(int s, int e) {
        e = Math.min(e, chars.length);
        for (int i = s, j = e - 1; i < j; i++, j--) {
            final char a = chars[i];
            final char b = chars[j];
            chars[i] = b;
            chars[j] = a;
        }
    }
}
