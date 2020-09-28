package com.raydya;

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int index = -1;

        for (int i = 0; i < nums.length; i++) {
            final int num = nums[i];

            if (target <= num) {
                index = i;
                break;
            }
        }

        return index == -1 ? nums.length : index;
    }
}
