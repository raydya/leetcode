package com.raydya;

public class MinimumOperationsToMakeTheArrayIncreasing {

    public int minOperations(int[] nums) {
        int op = 0;
        int p = nums[0];
        for (int i = 1; i < nums.length; i++) {
            final int n = nums[i];
            if (p >= n) {
                final int k = Math.abs(p - n + 1);
                op += k;
                nums[i] = nums[i] + k;
            }
            p = nums[i];
        }

        return op;
    }

}
