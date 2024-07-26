package com.raydya;

import java.util.Arrays;

public class FindTheValueOfThePartition {

    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);

        int min = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            final int d = nums[i] - nums[i - 1];
            min = Math.min(min, d);
        }

        return min;
    }

}
