package com.raydya;

public class CountNumberOfPairsWithAbsoluteDifferenceK {

    public int countKDifference(int[] nums, int k) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if (Math.abs(nums[i] - nums[j]) == k) {
                    c++;
                }
            }
        }

        return c / 2;
    }

}
