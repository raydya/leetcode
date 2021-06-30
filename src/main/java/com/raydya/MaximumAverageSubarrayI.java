package com.raydya;

public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];

        for (int i = 1; i < k; i++) {
            dp[i] = nums[i] + dp[i - 1];
        }

        int max = dp[k - 1];

        for (int i = k; i < nums.length; i++) {
            dp[i] = dp[i - 1] + nums[i] - nums[i - k];
            max = Math.max(max, dp[i]);
        }

        return max / (double) k;
    }
}
