package com.raydya;

public class SumOfUniqueElements {

    public int sumOfUnique(int[] nums) {
        final int[] h = new int[101];

        for (final int n : nums) {
            h[n]++;
        }

        int t = 0;
        for (int i = 0; i < h.length; i++) {
            final int n = h[i];
            if (n == 1) {
                t += i;
            }
        }

        return t;
    }
}
