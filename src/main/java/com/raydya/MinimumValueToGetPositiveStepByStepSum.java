package com.raydya;

public class MinimumValueToGetPositiveStepByStepSum {

    public int minStateValue(int[] nums) {
        int k = 1 - nums[0];

        while (true) {
            boolean f = true;
            int t = k + nums[0];
            for (int i = 1; i < nums.length; i++) {
                t += nums[i];
                if (t < 1) {
                    k += 1 - t;
                    f = false;
                    break;
                }
            }
            if (f) {
                break;
            }
        }

        return Math.max(k, 1);
    }

}
