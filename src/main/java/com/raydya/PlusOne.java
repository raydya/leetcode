package com.raydya;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        boolean overflow = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            final int digit = digits[i];
            if (digit + 1 < 10) {
                digits[i] = digit + 1;
                break;
            } else {
                digits[i] = digits[i] + 1 - 10;
                if (i - 1 < 0) {
                    overflow = true;
                }
            }
        }

        if (overflow) {
            final int[] ints = new int[digits.length + 1];
            ints[0] = 1;

            for (int i = 0; i < digits.length; i++) {
                final int digit = digits[0];
                ints[i + 1] = digit;
            }

            return ints;
        }

        return digits;
    }
}
