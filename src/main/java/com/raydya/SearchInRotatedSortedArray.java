package com.raydya;

public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
        final int f = nums[0];
        final int l = nums[nums.length - 1];

        if (target < f && target > l) {
            return -1;
        }
        if (target == f) {
            return 0;
        }
        if (target == l) {
            return nums.length - 1;
        }

        for (int i = 0; i < nums.length; i++) {
            final int num = nums[i];
            if (num == target) {
                return i;
            }
        }

        return -1;
    }
}
