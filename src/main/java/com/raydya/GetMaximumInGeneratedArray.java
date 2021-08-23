package com.raydya;

public class GetMaximumInGeneratedArray {
    public int getMaximumGenerated(int n) {
        if (n == 0) return 0;
        final int[] nums = new int[n + 1];
        int max = 1;
        nums[0] = 0;
        nums[1] = 1;

        for (int i = 1; i < nums.length; i++) {
            final int d = 2 * i;
            final int d1 = d + 1;
            if (d >= 2 && d <= n) {
                nums[d] = nums[i];
                max = Math.max(max, nums[d]);
            }
            if (d1 >= 2 && d1 <= n) {
                nums[d1] = nums[i] + nums[i + 1];
                max = Math.max(max, nums[d1]);
            }
        }

        return max;
    }
}
