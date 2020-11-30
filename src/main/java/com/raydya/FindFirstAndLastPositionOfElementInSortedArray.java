package com.raydya;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        return search(nums, target, 0);
    }

    private int[] search(int[] nums, int target, int offset) {
        final int length = nums.length;
        if (length == 0) return new int[]{-1, -1};
        if (length == 1) {
            if (target != nums[0]) {
                return new int[]{-1, -1};
            } else {
                return new int[]{0, 0};
            }
        }

        final int mid = length / 2;
        final int num = nums[mid];

        if (num == target) {
            int start = mid;
            int end = mid;
            while (start - 1 >= 0 && num == nums[start - 1]) {
                --start;
            }
            while (end + 1 <= length - 1 && num == nums[end + 1]) {
                ++end;
            }
            return new int[]{start + offset, end + offset};
        } else if (target < num) {
            final int[] copyOfRange = Arrays.copyOfRange(nums, 0, mid);
            return search(copyOfRange, target, offset);
        }
        final int[] copyOfRange = Arrays.copyOfRange(nums, mid, length);
        return search(copyOfRange, target, mid + offset);
    }
}
