package com.raydya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> output = new HashSet<>();
        for (int k = 0; k < n + 1; ++k) {
            backtrack(0, new ArrayList<>(), nums, n, k, output);
        }
        return new ArrayList<>(output);
    }

    private void backtrack(int first, ArrayList<Integer> curr, int[] nums, int n, int k, Set<List<Integer>> output) {
        // if the combination is done
        if (curr.size() == k) {
            output.add(new ArrayList<>(curr));
            return;
        }

        for (int i = first; i < n; ++i) {
            // add i into the current combination
            curr.add(nums[i]);
            // use next integers to complete the combination
            backtrack(i + 1, curr, nums, n, k, output);
            // backtrack
            curr.remove(curr.size() - 1);
        }
    }
}
