package com.raydya;

import java.util.Arrays;

public class CheckIfThereIsAValidPartitionForTheArray {

    public boolean validPartition(int[] nums) {
        int n = nums.length;
        boolean[] dp = new boolean[n + 1];
        Arrays.fill(dp, false);
        dp[0] = true;

        for (int i = 0; i < n; i++) {
            if (i >= 1 && nums[i] == nums[i - 1] && !dp[i + 1]) {
                dp[i + 1] = dp[i - 1];
            }
            if (i >= 2 && nums[i] == nums[i - 1] && nums[i] == nums[i - 2] && !dp[i + 1]) {
                dp[i + 1] = dp[i - 2];
            }
            if (i >= 2 && nums[i] - nums[i - 1] == 1 && nums[i - 1] - nums[i - 2] == 1 && !dp[i + 1]) {
                dp[i + 1] = dp[i - 2];
            }
        }

        return dp[n];
    }

}
