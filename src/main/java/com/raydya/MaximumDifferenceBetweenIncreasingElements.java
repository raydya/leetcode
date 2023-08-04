package com.raydya;

public class MaximumDifferenceBetweenIncreasingElements {

    public int maximumDifference(int[] nums) {
        int pMin = Integer.MAX_VALUE;
        int min = -1;
        for (final int num : nums) {
            final int g = num - pMin;
            if (g > 0) {
                min = Math.max(min, g);
            }
            pMin = Math.min(pMin, num);
        }

        return min;
    }

}
