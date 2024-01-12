package com.raydya;

import java.util.Arrays;

public class KeepMultipleFoundValuesByTwo {

    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            final int num = nums[i];
            if (num == original) {
                original *= 2;
            }
        }

        return original;
    }

}
