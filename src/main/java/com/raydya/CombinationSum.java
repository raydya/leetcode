package com.raydya;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        calc(candidates, new ArrayList<>(), 0, target, res);
        return res;
    }

    private void calc(int[] candidates, List<Integer> path, int index, int target,
        List<List<Integer>> res) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            path.add(candidates[i]);
            calc(candidates, path, i, target - candidates[i], res);
            path.remove(path.size() - 1);
        }
    }
}
