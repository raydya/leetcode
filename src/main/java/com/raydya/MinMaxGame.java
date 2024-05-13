package com.raydya;

public class MinMaxGame {

    public int minMaxGame(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        final int[] nNums = new int[nums.length / 2];

        for (int i = 0; i < nNums.length; i++) {
            if (i % 2 == 0) {
                nNums[i] = Math.min(nums[i * 2], nums[i * 2 + 1]);
            } else {
                nNums[i] = Math.max(nums[i * 2], nums[i * 2 + 1]);
            }
        }

        return minMaxGame(nNums);
    }

}
