package com.raydya;

public class MaximumCountOfPositiveIntegerAndNegativeInteger {

    public int maximumCount(int[] nums) {
        int neg = 0;
        int pos = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] > 0) {
                pos++;
            } else if (nums[j] < 0) {
                neg++;
            }
        }

        return Math.max(pos, neg);
    }

}
