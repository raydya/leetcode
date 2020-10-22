package com.raydya;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            final int num = nums[i];

            if (map.containsKey(num)) {
                if (i - map.get(num) <= k) {
                    return true;
                }
            }

            map.put(num, i);
        }

        return false;
    }
}
