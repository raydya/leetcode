package com.raydya.ethan.math;

/**
 * n! =n * (n - 1) * (n - 2) * ... * 1
 */
public class Factorial {

    public long f(int n) {
        long r = n;
        while (n > 2) {
            r *= n - 1;
            n--;
        }
        return r;
    }

    /**
     * recursive implementation
     */
    private long recursive(final int n) {
        if (n == 1) {
            return n;
        }
        return n * recursive(n - 1);
    }

}
