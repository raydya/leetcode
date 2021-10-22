package com.raydya;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int[] ret = new int[nums.length];
        int s = 0;
        int e = nums.length - 1;

        for (final int num : nums) {
            final boolean isEven = num % 2 == 0;
            if (isEven) {
                ret[s] = num;
                s++;
            } else {
                ret[e] = num;
                e--;
            }
        }

        return ret;
    }
}
