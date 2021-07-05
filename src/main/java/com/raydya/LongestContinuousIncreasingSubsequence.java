package com.raydya;

public class LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        int pre = nums[0];
        int cnt = 1;
        int max = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > pre) {
                cnt++;
            } else {
                max = Math.max(max, cnt);
                cnt = 1;
            }
            pre = nums[i];
        }

        max = Math.max(max, cnt);

        return max;
    }
}
