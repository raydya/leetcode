package com.raydya;

import java.util.HashMap;
import java.util.Map;

public class NRepeatedElementInSize2nArray {

    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int ret = -1;
        for (final int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > 1) {
                ret = num;
                break;
            }
        }

        return ret;
    }
}
