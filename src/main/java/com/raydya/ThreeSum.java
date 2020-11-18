package com.raydya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        Set<List<Integer>> holder = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            final int x = nums[i];

            if (i > 0 && x == nums[i - 1]) continue; // skip duplicate elements

            int p1 = i + 1;
            int p2 = nums.length - 1;

            while (p1 < p2) {
                final int n1 = nums[p1];
                final int n2 = nums[p2];
                final int sum = n1 + n2 + x;
                if (sum == 0) {
                    holder.add(Arrays.asList(x, n1, n2));
                }

                if (sum > 0) {
                    p2--;
                } else {
                    p1++;
                }
            }
        }

        return new ArrayList<>(holder);
    }
}
