package com.raydya;

import java.util.Arrays;

public class MaximumSumWithExactlyKElements {

    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);

        int max = 0;
        for (int i = 0; i < k; i++) {
            final int num = nums[nums.length - 1];
            max += num;
            nums[nums.length - 1] = num + 1;
        }

        return max;
    }

}
