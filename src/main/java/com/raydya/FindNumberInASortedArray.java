package com.raydya;

import java.util.Arrays;

public class FindNumberInASortedArray {

    public int search(int[] nums, int target) {
        final int i = Arrays.binarySearch(nums, target);
        if (i < 0) {
            return 0;
        }
        int ret = 0;
        for (int j = i; j < nums.length; j++) {
            if (nums[j] == target) {
                ret++;
            }
            if (nums[j] > target) {
                break;
            }
        }

        for (int j = i - 1; j >= 0; j--) {
            if (nums[j] == target) {
                ret++;
            }
            if (nums[j] < target) {
                break;
            }
        }

        return ret;
    }
}
