package com.raydya;

public class MaximumProductOfTwoElementsInAnArray {

    public int maxProduct(int[] nums) {
        int m, n;
        if (nums[0] >= nums[1]) {
            m = nums[0];
            n = nums[1];
        } else {
            m = nums[1];
            n = nums[0];
        }

        for (int i = 2; i < nums.length; i++) {
            final int num = nums[i];

            if (num >= m) {
                n = m;
                m = num;
            } else {
                n = Math.max(num, n);
            }
        }

        return (m - 1) * (n - 1);
    }
}
