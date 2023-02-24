package com.raydya;

public class MakeArrayZeroBySubtractingEqualAmounts {

    public int minimumOperations(int[] nums) {
        int x = Integer.MAX_VALUE;
        for (final int num : nums) {
            x = num > 0 ? Math.min(x, num) : x;
        }
        int cnt = 0;

        while (true) {
            int z = 0;
            int m = Integer.MAX_VALUE;
            boolean f = false;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    f = true;
                }
                nums[i] = Math.max(0, nums[i] - x);
                m = nums[i] > 0 ? Math.min(m, nums[i]) : m;
                z += nums[i];
            }
            x = m;
            if (f) {
                cnt++;
            }
            if (z == 0) {
                break;
            }
        }

        return cnt;
    }
}
