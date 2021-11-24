package com.raydya;

import java.util.Arrays;

public class MaximizeSumOfArrayAfterKNegations {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);

        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            final int num = nums[i];
            if (num < 0 && k > 0) {
                nums[i] = -num;
                total -= num;
                k--;
            } else {
                total += num;
            }
        }

        if (k == 0) return total;

        Arrays.sort(nums);

        final int i = k % 2;
        if (i > 0) {
            total -= nums[0] * 2;
        }

        return total;
    }
}
