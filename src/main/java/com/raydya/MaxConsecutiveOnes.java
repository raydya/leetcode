package com.raydya;

public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int[] h = new int[nums.length];
        h[0] = nums[0];

        int max = h[0];
        for (int i = 1; i < nums.length; i++) {
            final int n = nums[i];
            if (n == 0) {
                h[i] = 0;
            } else {
                h[i] += h[i - 1] + 1;
            }

            max = Math.max(max, h[i]);
        }

        return max;
    }
}
