package com.raydya;

import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (final int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int lhs = 0;

        for (final Map.Entry<Integer, Integer> entry : map.entrySet()) {
            final Integer k = entry.getKey();
            final int p = k - 1;
            final int n = k + 1;

            final Integer pc = map.getOrDefault(p, 0);
            final Integer nc = map.getOrDefault(n, 0);

            if (pc > 0 || nc > 0) {
                final int m = Math.max(pc, nc) + entry.getValue();
                lhs = Math.max(m, lhs);
            }
        }

        return lhs;
    }
}
