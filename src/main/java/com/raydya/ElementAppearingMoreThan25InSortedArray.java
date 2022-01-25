package com.raydya;

public class ElementAppearingMoreThan25InSortedArray {
    public int findSpecialInteger(int[] arr) {
        final double k = arr.length / 4.0;

        int t = 0;
        int v = -1;
        for (final int j : arr) {
            if (v != j) {
                v = j;
                t = 1;
            } else {
                t++;
            }

            if (t > k) {
                return v;
            }
        }

        return -1;
    }
}
