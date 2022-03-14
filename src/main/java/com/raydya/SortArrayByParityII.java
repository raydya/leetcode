package com.raydya;

public class SortArrayByParityII {

    public int[] sortArrayByParityII(int[] nums) {
        final int[] ret = new int[nums.length];

        int even = 0;
        int odd = 1;
        for (final int n : nums) {
            if (n % 2 == 0) {
                ret[even] = n;
                even += 2;
            } else {
                ret[odd] = n;
                odd += 2;
            }
        }

        return ret;
    }
}
