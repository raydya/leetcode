package com.raydya;

public class SecondLargestDigitInAString {

    public int secondHighest(String s) {
        int m = -1;
        int sm = -1;

        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            if (Character.isDigit(c)) {
                final int k = Character.getNumericValue(c);
                if (k > m) {
                    sm = m;
                    m = k;
                } else {
                    if (k != m) {
                        sm = Math.max(sm, k);
                    }
                }
            }
        }

        return sm;
    }

}
