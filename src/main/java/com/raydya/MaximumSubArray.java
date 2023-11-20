package com.raydya;

public class MaximumSubArray {

    public int maxSubArray(int[] nums) {
        int dp = nums[0];
        int res = nums[0];

        for (int i = 1; i < nums.length; i++) {
            final int x = nums[i];
            dp = Math.max(dp, 0) + x;
            res = Math.max(res, dp);
        }

        return res;
    }

}
