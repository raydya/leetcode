package com.raydya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumSubsequenceInNonIncreasingOrder {

    public List<Integer> minSubsequence(int[] nums) {
        int total = 0;

        Arrays.sort(nums);

        for (final int num : nums) {
            total += num;
        }

        int c = 0;
        final List<Integer> ret = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            final int m = nums[i] + c;
            c += nums[i];
            ret.add(nums[i]);
            if (m > (total - m)) {
                break;
            }
        }

        return ret;
    }

}
