package com.raydya;

public class ApplyOperationsToAnArray {

    public int[] applyOperations(int[] nums) {
        final int l = nums.length;

        for (int i = 0; i < l - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        final int[] t = new int[l];

        int p1 = 0;
        int p2 = l - 1;

        for (final int n : nums) {
            if (n == 0) {
                t[p2] = 0;
                p2--;
            } else {
                t[p1] = n;
                p1++;
            }
        }

        return t;
    }

}
