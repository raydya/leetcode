package com.raydya;

public class CountOddNumbersInAnIntervalRange {
    public int countOdds(int low, int high) {
        final int k = high - low + 1;
        if (k % 2 == 0) {
            return k / 2;
        }
        if (low % 2 == 0) {
            return k / 2;
        } else {
            return k / 2 + 1;
        }
    }
}
