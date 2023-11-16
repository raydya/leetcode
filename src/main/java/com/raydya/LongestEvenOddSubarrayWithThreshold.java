package com.raydya;

public class LongestEvenOddSubarrayWithThreshold {

    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            final int num = nums[i];
            if (num % 2 != 0) {
                continue;
            }
            int cnt = 0;
            for (int j = i; j < nums.length; j++) {
                final boolean condition2 = nums[j] <= threshold;
                if (!condition2) {
                    break;
                }
                if (j > i) {
                    final boolean condition1 = nums[j - 1] % 2 != nums[j] % 2;
                    if (!condition1) {
                        break;
                    }
                }
                cnt++;
            }
            max = Math.max(cnt, max);
        }

        return max;
    }

}
