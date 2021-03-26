package com.raydya;

public class TargetSum {
    public int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        for (int num : nums) sum += num;
        if (S > sum || (S + sum) % 2 == 1) return 0;
        int target = (S + sum) / 2;
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int num : nums) {
            for (int j = target; j >= num; j--) {
                dp[j] = dp[j] + dp[j - num];
            }
        }
        return dp[target];
    }
}
