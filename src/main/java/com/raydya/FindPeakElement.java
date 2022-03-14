package com.raydya;

public class FindPeakElement {

    public int findPeakElement(int[] nums) {
        int maxValue = Integer.MIN_VALUE;
        int maxIndex = 0;
        final int l = nums.length;
        for (int i = 0; i < l; i++) {
            final int num = nums[i];
            if (num > maxValue) {
                maxValue = num;
                maxIndex = i;
            }
            if (i == 0 || i == l - 1) {
                continue;
            }

            if (num > nums[i - 1] && num > nums[i + 1]) {
                return i;
            }
        }

        return maxIndex;
    }
}
