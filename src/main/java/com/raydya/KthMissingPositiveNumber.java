package com.raydya;

public class KthMissingPositiveNumber {

    public int findKthPositive(int[] arr, int k) {
        final int m = arr[arr.length - 1];

        final boolean[] h = new boolean[m + k];
        for (final int j : arr) {
            h[j - 1] = true;
        }

        int c = 0;
        for (int i = 0; i < h.length; i++) {
            if (!h[i]) {
                c++;
            }
            if (c == k) {
                return i + 1;
            }
        }

        return -1;
    }

}
