package com.raydya;

public class MaximumNumberOfPairsInArray {

    public int[] numberOfPairs(int[] nums) {
        final int[] h = new int[101];

        int p = 0;
        for (final int n : nums) {
            h[n]++;
            if (h[n] == 2) {
                h[n] -= 2;
                p++;
            }
        }

        int c = 0;
        for (final int j : h) {
            if (j > 0) {
                c++;
            }
        }

        return new int[]{p, c};
    }

}
