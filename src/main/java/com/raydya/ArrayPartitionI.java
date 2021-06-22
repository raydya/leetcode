package com.raydya;

import java.util.Arrays;

public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int ret = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            final int step = i * 2;
            ret += nums[step];
        }

        return ret;
    }
}
