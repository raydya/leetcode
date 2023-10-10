package com.raydya;

import java.util.Arrays;

public class MovementOfRobots {

    private static final int MOD = 1_000_000_007;

    public int sumDistance(int[] nums, String s, int d) {
        int n = nums.length;

        long[] pos = new long[n];

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'L') {
                pos[i] = (long) nums[i] - d;
            } else {
                pos[i] = (long) nums[i] + d;
            }
        }

        Arrays.sort(pos);

        long res = 0;
        for (int i = 1; i < n; i++) {
            res += (pos[i] - pos[i - 1]) * i % MOD * (n - i) % MOD;
            res %= MOD;
        }

        return (int) res;
    }

}
