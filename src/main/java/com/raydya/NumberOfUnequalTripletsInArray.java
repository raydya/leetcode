package com.raydya;

import java.util.HashMap;
import java.util.Map;

public class NumberOfUnequalTripletsInArray {

    public int unequalTriplets(int[] nums) {
        final Map<Integer, Integer> count = new HashMap<>();
        for (int x : nums) {
            count.merge(x, 1, Integer::sum);
        }
        int res = 0, n = nums.length, t = 0;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            res += t * entry.getValue() * (n - t - entry.getValue());
            t += entry.getValue();
        }
        return res;
    }

}
