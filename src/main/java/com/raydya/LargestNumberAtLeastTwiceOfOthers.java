package com.raydya;

public class LargestNumberAtLeastTwiceOfOthers {

    public int dominantIndex(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int max = 0;
        int sMax = 0;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            final int num = nums[i];
            if (num > max) {
                sMax = max;
                max = num;
                index = i;
            } else if (num > sMax) {
                sMax = num;
            }
        }

        if (max >= sMax * 2) {
            return index;
        }

        return -1;
    }
}
