package com.raydya;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberOfDistinctAverages {

    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);

        final int k = nums.length / 2;
        int i = 0;

        final Set<Double> set = new HashSet<>();

        while (i < k) {
            final int s = nums[i];
            final int e = nums[nums.length - 1 - i];

            final double p = (s + e) / 2.0;

            set.add(p);

            i++;
        }

        return set.size();
    }

}
