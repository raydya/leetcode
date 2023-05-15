package com.raydya;

public class MinimumDistanceOfTheTargetElement {

    public int getMinDistance(int[] nums, int target, int start) {
        int m = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target) {
                continue;
            }

            final int v = Math.abs(i - start);
            m = Math.min(v, m);
        }

        return m;
    }

}
