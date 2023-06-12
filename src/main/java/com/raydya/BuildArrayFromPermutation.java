package com.raydya;

public class BuildArrayFromPermutation {

    public int[] buildArray(int[] nums) {
        final int[] ret = new int[nums.length];

        for (int i = 0; i < ret.length; i++) {
            ret[i] = nums[nums[i]];
        }

        return ret;
    }

}
