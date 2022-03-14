package com.raydya;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> output = new ArrayList<>();
        for (int k = 0; k < n + 1; ++k) {
            backtrack(0, new ArrayList<>(), nums, n, k, output);
        }
        return output;
    }

    private void backtrack(int first, ArrayList<Integer> curr, int[] nums, int n, int k,
        List<List<Integer>> output) {
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
