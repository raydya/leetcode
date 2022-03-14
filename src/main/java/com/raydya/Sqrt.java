package com.raydya;

public class Sqrt {

    public int sqrt(int x) {
        if (x < 2) {
            return x;
        }

        long left = 1;
        long right = x;

        while (left < right) {
            long mid = left + (right - left) / 2;

            final long i = mid * mid;
            if (i == x) {
                return (int) mid;
            } else if (i > x) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return (int) left - 1;
    }
}
