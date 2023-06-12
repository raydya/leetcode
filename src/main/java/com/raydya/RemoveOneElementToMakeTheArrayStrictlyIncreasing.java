package com.raydya;

public class RemoveOneElementToMakeTheArrayStrictlyIncreasing {

    public boolean canBeIncreasing(int[] nums) {
        final int l = nums.length;
        final int[][] h = new int[l][l - 1];
        for (int i = 0; i < l; i++) {
            int k = 0;
            boolean f = true;

            for (int j = 0; j < l; j++) {
                if (i == j) {
                    continue;
                }
                h[i][k] = nums[j];

                if (k - 1 >= 0 && h[i][k - 1] >= h[i][k]) {
                    f = false;
                }
                k++;
            }

            if (f) {
                return true;
            }
        }
        return false;
    }
}
