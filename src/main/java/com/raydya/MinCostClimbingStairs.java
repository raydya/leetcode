package com.raydya;

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        final int[] f = new int[cost.length + 1];

        for (int i = 2; i < f.length; i++) {
            f[i] = Math.min(f[i - 2] + cost[i - 2], f[i - 1] + cost[i - 1]);
        }

        return f[f.length - 1];
    }
}
