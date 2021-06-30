package com.raydya;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        final int[] ints = new int[nums.length + 1];

        for (final int num : nums) {
            ints[num] += 1;
        }

        final int[] ret = new int[2];
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] == 2) ret[0] = i;
            if (ints[i] == 0) ret[1] = i;
        }

        return ret;
    }
}
