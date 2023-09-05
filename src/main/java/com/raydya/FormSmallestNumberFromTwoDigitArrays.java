package com.raydya;

public class FormSmallestNumberFromTwoDigitArrays {

    public int minNumber(int[] nums1, int[] nums2) {
        final int[] h = new int[10];
        int m1 = Integer.MAX_VALUE;
        int m2 = Integer.MAX_VALUE;
        int t = Integer.MAX_VALUE;
        for (final int i : nums1) {
            h[i]++;
            m1 = Math.min(i, m1);
        }

        for (final int i : nums2) {
            h[i]++;
            m2 = Math.min(i, m2);
            if (h[i] == 2) {
                t = Math.min(t, i);
            }
        }

        if (t != Integer.MAX_VALUE) {
            return t;
        }

        if (m1 < m2) {
            return Integer.parseInt(m1 + "" + m2);
        }
        return Integer.parseInt(m2 + "" + m1);
    }

}
