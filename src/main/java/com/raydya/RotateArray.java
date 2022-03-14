package com.raydya;

import java.util.Arrays;

public class RotateArray {

    public void rotate(int[] nums, int k) {
        final int l = nums.length;
        if (l == 1) {
            return;
        }
        final int[] copy = Arrays.copyOf(nums, l);
        for (int i = 0; i < l; i++) {
            final int m = i + k >= l ? (i + k) % l : i + k;
            nums[m] = copy[i];
        }
    }
}
