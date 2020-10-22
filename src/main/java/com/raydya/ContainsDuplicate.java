package com.raydya;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 1) return false;

        Set<Integer> set = new HashSet<>(nums.length);

        for (final int num : nums) {
            if (set.contains(num)) return true;
            set.add(num);
        }

        return false;
    }
}
