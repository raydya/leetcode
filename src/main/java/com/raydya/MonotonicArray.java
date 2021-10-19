package com.raydya;

public class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        int trend = 0;

        for (int i = 1; i < nums.length; i++) {
            final int k = nums[i] - nums[i - 1];

            if (trend == 0) {
                if (k < 0) {
                    // 增
                    trend = 1;
                } else if (k > 0) {
                    // 减
                    trend = -1;
                }
            } else {
                if (k < 0 && trend == -1) {
                    return false;
                }

                if (k > 0 && trend == 1) {
                    return false;
                }
            }
        }

        return true;
    }
}
