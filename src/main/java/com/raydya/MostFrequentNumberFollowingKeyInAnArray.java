package com.raydya;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentNumberFollowingKeyInAnArray {

    public int mostFrequent(int[] nums, int key) {
        final Map<Integer, Integer> map = new HashMap<>();

        int max = 0;
        int mt = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            final int num = nums[i];
            if (num == key) {
                final int target = nums[i + 1];
                final int v = map.getOrDefault(target, 0) + 1;
                if (v > max) {
                    max = v;
                    mt = target;
                }
                map.put(target, v);
            }
        }

        return mt;
    }

}
