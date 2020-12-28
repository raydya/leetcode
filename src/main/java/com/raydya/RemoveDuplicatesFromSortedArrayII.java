package com.raydya;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int cur = nums[0];
        int cnt = 1;
        int totalCnt = 0;
        int i = 1;

        while (i < nums.length - totalCnt) {
            if (nums[i] == cur) {
                cnt++;
                if (cnt > 2) {
                    totalCnt += cnt - 2;
                    for (int j = i; j < nums.length; j++) {
                        final int x = j - (cnt - 2);
                        nums[x] = nums[j];
                    }
                    cnt--;
                    i--;
                }
            } else {
                cur = nums[i];
                cnt = 1;
            }
            i++;
        }

        nums = Arrays.copyOf(nums, nums.length - totalCnt);

        return nums.length;
    }
}
