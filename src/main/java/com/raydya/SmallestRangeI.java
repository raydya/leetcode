package com.raydya;

public class SmallestRangeI {
    public int smallestRangeI(int[] nums, int k) {
        if (nums.length == 1) return 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (final int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        final int v = max - k - (min + k);
        return Math.max(0, v);
    }
}
