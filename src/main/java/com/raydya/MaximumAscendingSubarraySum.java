package com.raydya;

public class MaximumAscendingSubarraySum {

    public int maxAscendingSum(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int p = 0;
        int m = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                int t = 0;
                for (int j = p; j < i; j++) {
                    t += nums[j];
                }
                m = Math.max(m, t);
                p = i;
            } else if (i == nums.length - 1) {
                int t = 0;
                for (int j = p; j <= i; j++) {
                    t += nums[j];
                }
                m = Math.max(m, t);
                p = i;
            }
        }
        return m;
    }

}
