package com.raydya;

public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            final int p = nums[i];
            if (i + 1 >= nums.length) break;
            final int n = nums[i + 1];
            if (p > n) return n;
        }
        return nums[0];
    }
}
