package com.raydya;

public class CheckIfNumberHasEqualDigitCountAndDigitValue {

    public boolean digitCount(String num) {
        final int[] h = new int[10];

        for (int i = 0; i < num.length(); i++) {
            final int c = num.charAt(i) - '0';
            h[c]++;
        }

        for (int i = 0; i < num.length(); i++) {
            final int c = num.charAt(i) - '0';

            if (h[i] != c) {
                return false;
            }
        }

        return true;
    }
}
