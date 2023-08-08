package com.raydya;

public class MaximumAbsoluteSumOfAnySubarray {

    public int maxAbsoluteSum(int[] nums) {
        final int[] dp0 = new int[nums.length];
        final int[] dp1 = new int[nums.length];
        dp0[0] = nums[0];
        dp1[0] = nums[0];
        int m = Math.abs(dp0[0]);
        for (int i = 1; i < nums.length; i++) {
            final int n = nums[i];
            dp0[i] = Math.max(dp0[i - 1] + n, n);
            dp1[i] = Math.min(dp1[i - 1] + n, n);
            m = Math.max(m, Math.max(Math.abs(dp0[i]), Math.abs(dp1[i])));
        }

        return m;
    }

}
