package com.raydya;

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int maxF = nums[0], minF = nums[0], ans = nums[0];
        int length = nums.length;
        for (int i = 1; i < length; ++i) {
            maxF = Math.max(maxF * nums[i], Math.max(nums[i], minF * nums[i]));
            minF = Math.min(minF * nums[i], Math.min(nums[i], maxF * nums[i]));
            ans = Math.max(maxF, ans);
        }
        return ans;
    }
}
