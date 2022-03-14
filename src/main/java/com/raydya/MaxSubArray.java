package com.raydya;

public class MaxSubArray {

    public int maxSubArray(int[] nums) {
        final int length = nums.length;

        int max = nums[0];
        int current = nums[0];

        for (int i = 1; i < length; i++) {
            final int num = nums[i];
            current = Math.max(num, current + num);

            if (current > max) {
                max = current;
            }
        }

        return max;
    }
}
