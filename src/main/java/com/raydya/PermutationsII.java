package com.raydya;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermutationsII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> list = new HashSet<>();
        backtrack(list, new ArrayList<>(), nums, new ArrayList<>());
        return new ArrayList<>(list);
    }

    private void backtrack(Set<List<Integer>> list, List<Integer> tempList, int[] nums, List<Integer> indices) {
        if (tempList.size() == nums.length) {
            list.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (indices.contains(i)) continue;
                indices.add(i);
                tempList.add(nums[i]);
                backtrack(list, tempList, nums, indices);
                tempList.remove(tempList.size() - 1);
                indices.remove(indices.size() - 1);
            }
        }
    }
}
