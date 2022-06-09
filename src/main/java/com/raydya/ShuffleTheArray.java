package com.raydya;

public class ShuffleTheArray {

    public int[] shuffle(int[] nums, int n) {
        final int[] ret = new int[nums.length];

        int offset = 0;
        for (int i = 0; i < ret.length; i += 2) {
            ret[i] = nums[offset];
            ret[i + 1] = nums[n + offset];
            offset++;
        }

        return ret;
    }

}
