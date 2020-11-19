package com.raydya;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        long closest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            final int x = nums[i];

            int p1 = i + 1;
            int p2 = nums.length - 1;

            while (p1 < p2) {
                final int n1 = nums[p1];
                final int n2 = nums[p2];
                final int sum = n1 + n2 + x;

                if (sum == target) {
                    return sum;
                } else {
                    final long g1 = Math.abs(target - sum);
                    final long g2 = Math.abs(target - closest);
                    if (g1 < g2) {
                        closest = sum;
                    }
                }

                if (sum > target) {
                    p2--;
                } else {
                    p1++;
                }
            }
        }

        return (int) closest;
    }
}
