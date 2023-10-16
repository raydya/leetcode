package com.raydya;

import java.util.Arrays;

public class SingleNumberIII {

    public int[] singleNumber(int[] nums) {
        if (nums.length == 2) {
            return nums;
        }

        Arrays.sort(nums);

        int k = 0;
        final int[] ret = new int[2];
        if (nums[0] != nums[1]) {
            ret[k] = nums[0];
            k++;
        }
        for (int i = 1; i < nums.length - 1; i++) {
            final int n = nums[i];
            if (nums[i - 1] != n && n != nums[i + 1]) {
                ret[k] = n;
                k++;
                if (k == 2) {
                    break;
                }
            }
        }

        if (k == 1) {
            ret[1] = nums[nums.length - 1];
        }

        return ret;
    }

}
