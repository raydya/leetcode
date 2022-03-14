package com.raydya;

import java.util.Arrays;

public class HouseRobberII {

    public int rob(int[] nums) {
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        } else if (length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        final int[] r1 = Arrays.copyOfRange(nums, 0, length - 1);
        final int[] r2 = Arrays.copyOfRange(nums, 1, length);
        return Math.max(robRange(r1), robRange(r2));
    }

    public int robRange(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        int[] dp = new int[nums.length];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }

        return dp[nums.length - 1];
    }
}
