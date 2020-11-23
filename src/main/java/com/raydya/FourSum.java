package com.raydya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        Set<List<Integer>> holder = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            final int x = nums[i];

            if (i > 0 && x == nums[i - 1]) continue; // skip duplicate elements

            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;

                final int y = nums[j];

                int p1 = i + 1;
                int p2 = nums.length - 1;

                while (p1 < p2 && p1 != i && p1 != j && p2 != i && p2 != j) {
                    final int n1 = nums[p1];
                    final int n2 = nums[p2];
                    final int sum = n1 + n2 + x + y;
                    if (sum == target) {
                        final List<Integer> z = Arrays.asList(x, y, n1, n2);
                        Collections.sort(z);
                        holder.add(z);
                    }

                    if (sum > target) {
                        p2--;
                    } else {
                        p1++;
                    }
                }
            }

        }

        return new ArrayList<>(holder);
    }
}
