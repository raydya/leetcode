package com.raydya;

public class ClimbingStairs {

    public int climbStairs(int n) {
        if (n == 1) return 1;

        final int[] ints = new int[n + 1];
        ints[1] = 1;
        ints[2] = 2;

        for (int i = 3; i <= n; i++) {
            ints[i] = ints[i - 1] + ints[i - 2];
        }

        return ints[n];
    }
}
