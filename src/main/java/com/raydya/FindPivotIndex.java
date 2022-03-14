package com.raydya;

public class FindPivotIndex {

    public int pivotIndex(int[] nums) {
        final int l = nums.length;
        final int[] p = new int[l];
        p[0] = nums[0];

        for (int i = 1; i < l; i++) {
            p[i] = p[i - 1] + nums[i];
        }

        if (p[l - 1] - p[0] == 0) {
            return 0;
        }

        for (int i = 1; i < l; i++) {
            if (p[i - 1] == (p[l - 1] - p[i])) {
                return i;
            }
        }

        return -1;
    }
}
