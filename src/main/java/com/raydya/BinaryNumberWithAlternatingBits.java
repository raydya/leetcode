package com.raydya;

public class BinaryNumberWithAlternatingBits {

    public boolean hasAlternatingBits(int n) {
        final String s = Integer.toBinaryString(n);

        for (int i = 0; i < s.length() - 1; i++) {
            final char current = s.charAt(i);
            final char next = s.charAt(i + 1);

            if (current == next) {
                return false;
            }
        }

        return true;
    }
}
