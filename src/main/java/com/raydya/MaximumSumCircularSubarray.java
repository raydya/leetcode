package com.raydya;

public class MaximumSumCircularSubarray {

    public int maxSubarrayCircular(int[] nums) {
        int n = nums.length;
        int preMax = nums[0];
        int maxRes = nums[0];
        int preMin = nums[0];
        int minRes = nums[0];
        int sum = nums[0];
        for (int i = 1; i < n; i++) {
            preMax = Math.max(preMax + nums[i], nums[i]);
            maxRes = Math.max(maxRes, preMax);
            preMin = Math.min(preMin + nums[i], nums[i]);
            minRes = Math.min(minRes, preMin);
            sum += nums[i];
        }
        if (maxRes < 0) {
            return maxRes;
        } else {
            return Math.max(maxRes, sum - minRes);
        }
    }
}
