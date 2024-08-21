package com.raydya;

public class MinimumCutsToDivideACircle {

    public int numberOfCuts(int n) {
        if (n == 1) {
            return 0;
        }
        final int k = n % 2;
        if (k == 0) {
            return n / 2;
        } else {
            return n;
        }
    }

}
