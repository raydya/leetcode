package com.raydya;

import java.util.HashMap;

public class SingleNumberII {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];

        final HashMap<Integer, Integer> holder = new HashMap<>(nums.length);

        for (final int num : nums) {
            holder.merge(num, 1, Integer::sum);
        }

        return holder.entrySet().stream()
            .filter(entry -> entry.getValue() == 1)
            .findFirst()
            .map(HashMap.Entry::getKey)
            .orElse(0);
    }
}
