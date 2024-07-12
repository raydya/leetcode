package com.raydya;

import java.util.Arrays;

public class MinimumNumberGame {

    public int[] numberGame(int[] nums) {
        final int[] ans = new int[nums.length];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            if (i + 1 < nums.length) {
                ans[i] = nums[i + 1];
                ans[i + 1] = nums[i];
            } else {
                ans[i] = nums[i];
            }
        }

        return ans;
    }

}
