package com.raydya;

public class RemoveOneElementToMakeTheArrayStrictlyIncreasing {

    public boolean canBeIncreasing(int[] nums) {
        final int[][] h = new int[nums.length][nums.length - 1];
        for (int i = 0; i < nums.length; i++) {
            int k = 0;

            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                h[i][k] = nums[j];
                k++;
            }
        }

        for (final int[] k : h) {
            boolean f = true;
            for (int j = 1; j < k.length; j++) {
                if (k[j - 1] < k[j]) {
                    continue;
                }
                f = false;
            }
            if (f) {
                return true;
            }
        }

        return false;
    }
}
