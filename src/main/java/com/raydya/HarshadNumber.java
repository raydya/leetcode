package com.raydya;

public class HarshadNumber {

    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int t = 0;

        final String s = String.valueOf(x);
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            final int v = c - '0';
            t += v;
        }

        return x % t == 0 ? t : -1;
    }

}
