package com.raydya;

import java.util.Arrays;

public class MinimumDifferenceBetweenHighestAndLowestOfKScores {

    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);

        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= nums.length - k; i++) {
            final int m = nums[i];
            final int n = nums[i + k - 1];
            min = Math.min(min, n - m);
        }

        return min;
    }

}
