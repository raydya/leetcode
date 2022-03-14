package com.raydya;

public class ReverseInteger {

    public int reverse(int x) {
        long reversed = 0;

        while (x != 0) {
            final int d = x % 10;
            reversed = reversed * 10 + d;
            x = x / 10;
        }

        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) reversed;
    }
}
