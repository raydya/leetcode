package com.raydya;

import java.util.HashMap;
import java.util.Map;

public class NumberOfEquivalentDominoPairs {
    public int numEquivDominoPairs(int[][] dominoes) {
        int cnt = 0;

        Map<String, Integer> map = new HashMap<>();

        for (final int[] d : dominoes) {
            final String k1 = Integer.toString(d[0]).concat("-").concat(Integer.toString(d[1]));
            final Integer v1 = map.getOrDefault(k1, 0);
            cnt += v1;

            final String k2 = Integer.toString(d[1]).concat("-").concat(Integer.toString(d[0]));
            if (!k1.equals(k2)) {
                final Integer v2 = map.getOrDefault(k2, 0);
                cnt += v2;
            }

            map.put(k1, map.getOrDefault(k1, 0) + 1);
        }

        return cnt;
    }
}
