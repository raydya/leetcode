package com.raydya;

import java.util.HashMap;
import java.util.Map;

public class FindSubarraysWithEqualSum {

    public boolean findSubarrays(int[] nums) {
        final Map<Integer, Integer> map = new HashMap<>();

        final int length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            int sum = nums[i] + nums[i + 1];
            if (map.containsKey(sum)) {
                return true;
            }
            map.put(sum, 1);
        }

        return false;
    }

}
