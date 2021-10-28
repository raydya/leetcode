package com.raydya;

public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        final char[] chars = s.toCharArray();

        int m = 0;
        int n = chars.length - 1;

        while (m <= n) {
            if (!Character.isLetter(chars[m])) {
                m++;
                continue;
            }
            if (!Character.isLetter(chars[n])) {
                n--;
                continue;
            }
            final char mv = chars[m];
            chars[m] = chars[n];
            chars[n] = mv;
            m++;
            n--;
        }

        return String.valueOf(chars);
    }
}
