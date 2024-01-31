package com.raydya;

import java.util.HashSet;
import java.util.Set;

public class FindTheDistinctDifferenceArray {

    public int[] distinctDifferenceArray(int[] nums) {
        final int[] ret = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            Set<Integer> p = new HashSet<>();
            Set<Integer> s = new HashSet<>();
            for (int j = 0; j <= i; j++) {
                p.add(nums[j]);
            }
            for (int j = i + 1; j < nums.length; j++) {
                s.add(nums[j]);
            }
            ret[i] = p.size() - s.size();
        }
        return ret;
    }

}
