package com.raydya;

public class CombinationSumIV {

    public int combinationSum4(int[] nums, int target) {
        final int[] dp = new int[target + 1];
        dp[0] = 1;

        for (int i = 1; i <= target; i++) {
            for (final int num : nums) {
                if (i >= num) {
                    dp[i] += dp[i - num];
                }
            }
        }

        return dp[target];
    }

}
