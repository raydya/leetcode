package com.raydya;

import java.util.Arrays;

public class LargestPositiveIntegerThatExistsWithItsNegative {

    public int findMaxK(int[] nums) {
        Arrays.sort(nums);

        int rp = nums.length - 1;

        while (rp > 0 && nums[rp] > 0) {
            final int max = nums[rp];
            int lp = 0;

            while (nums[lp] < 0) {
                if (max == -nums[lp]) {
                    return max;
                }
                lp++;
            }

            rp--;
        }

        return -1;
    }

}
