package com.raydya;

public class NthTribonacciNumber {

    private final int[] t = new int[38];

    public int tribonacci(int n) {
        t[0] = 0;
        t[1] = 1;
        t[2] = 1;

        for (int i = 3; i < t.length; i++) {
            t[i] = t[i - 1] + t[i - 2] + t[i - 3];
        }

        return t[n];
    }
}
