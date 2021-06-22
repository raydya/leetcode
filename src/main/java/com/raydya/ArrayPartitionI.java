package com.raydya;

import java.util.Arrays;

public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int ret = 0;
        final int l = nums.length / 2;
        for (int i = 0; i < l; i++) {
            final int step = i * 2;
            ret += nums[step];
        }

        return ret;
    }
}
