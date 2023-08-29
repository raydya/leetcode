package com.raydya;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BinaryTreesWithFactors {

    public int numFactoredBinaryTrees(int[] arr) {
        final int mod = 1_000_000_007;
        final int len = arr.length;
        final long[] dp = new long[len];
        Arrays.sort(arr);
        Arrays.fill(dp, 1);
        final Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; ++i) {
            map.put(arr[i], i);
        }
        for (int i = 0; i < len; ++i) {
            for (int j = 0; j < i; ++j) {
                if (arr[i] % arr[j] == 0) {
                    final int right = arr[i] / arr[j];
                    if (map.containsKey(right)) {
                        dp[i] = (dp[i] + dp[j] * dp[map.get(right)]) % mod;
                    }
                }
            }
        }
        long ans = 0;
        for (final long x : dp) {
            ans += x;
        }
        return (int) (ans % mod);
    }

}
