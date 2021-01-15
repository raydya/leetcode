package com.raydya;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PermutationsII {
//    public List<List<Integer>> permuteUnique(int[] nums) {
//        Set<List<Integer>> list = new HashSet<>();
//        backtrack(list, new ArrayList<>(), nums, new ArrayList<>());
//        return new ArrayList<>(list);
//    }
//
//    private void backtrack(Set<List<Integer>> list, List<Integer> tempList, int[] nums, List<Integer> indices) {
//        if (tempList.size() == nums.length) {
//            list.add(new ArrayList<>(tempList));
//        } else {
//            for (int i = 0; i < nums.length; i++) {
//                if (indices.contains(i)) continue;
//                indices.add(i);
//                tempList.add(nums[i]);
//                backtrack(list, tempList, nums, indices);
//                tempList.remove(tempList.size() - 1);
//                indices.remove(indices.size() - 1);
//            }
//        }
//    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();

        // count the occurrence of each number
        HashMap<Integer, Integer> counter = new HashMap<>();
        for (int num : nums) {
            if (!counter.containsKey(num))
                counter.put(num, 0);
            counter.put(num, counter.get(num) + 1);
        }

        LinkedList<Integer> comb = new LinkedList<>();
        this.backtrack(comb, nums.length, counter, results);
        return results;
    }

    private void backtrack(LinkedList<Integer> comb, Integer N, HashMap<Integer, Integer> counter, List<List<Integer>> results) {
        if (comb.size() == N) {
            // make a deep copy of the resulting permutation,
            // since the permutation would be backtracked later.
            results.add(new ArrayList<Integer>(comb));
            return;
        }

        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            Integer num = entry.getKey();
            Integer count = entry.getValue();
            if (count == 0)
                continue;
            // add this number into the current combination
            comb.addLast(num);
            counter.put(num, count - 1);

            // continue the exploration
            backtrack(comb, N, counter, results);

            // revert the choice for the next exploration
            comb.removeLast();
            counter.put(num, count);
        }
    }
}
