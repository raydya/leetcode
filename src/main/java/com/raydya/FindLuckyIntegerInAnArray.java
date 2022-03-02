package com.raydya;

public class FindLuckyIntegerInAnArray {

    public int findLucky(int[] arr) {
        final int[] t = new int[501];

        for (final int j : arr) {
            t[j]++;
        }

        for (int i = t.length - 1; i > 0; i--) {
            if (i == t[i]) {
                return i;
            }
        }

        return -1;
    }

}
