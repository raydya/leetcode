package com.raydya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> holder = new ArrayList<>();
        Arrays.sort(candidates);
        comb(candidates, target, 0, new ArrayList<>(), holder);
        return holder;
    }

    private void comb(int[] candidates, int target, int index, List<Integer> path, List<List<Integer>> holder) {
        if (target < 0) return;
        if (target == 0) {
            holder.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) continue;
            final int candidate = candidates[i];
            path.add(candidate);
            comb(candidates, target - candidate, i + 1, path, holder);
            path.remove(path.size() - 1);
        }
    }
}
