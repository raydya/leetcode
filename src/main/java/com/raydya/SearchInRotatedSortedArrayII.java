package com.raydya;

public class SearchInRotatedSortedArrayII {

    public boolean search(int[] nums, int target) {
        if (nums.length == 0) {
            return false;
        }
        final int f = nums[0];
        final int l = nums[nums.length - 1];

        if (target < f && target > l) {
            return false;
        }
        if (target == f || target == l) {
            return true;
        }

        for (final int num : nums) {
            if (num == target) {
                return true;
            }
        }

        return false;
    }
}
