package com.raydya;

import com.raydya.data.type.TreeNode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class KthLargestSumInABinaryTree {


    public long kthLargestLevelSum(TreeNode root, int k) {
        final Map<Integer, Long> levelSum = new HashMap<>();
        dfs(root, 0, levelSum);

        final List<Long> l = levelSum.values().stream().sorted().collect(Collectors.toList());
        final int i = l.size() - k;

        if (i < 0) {
            return -1;
        }
        return l.get(i);
    }

    private void dfs(TreeNode root, int level, Map<Integer, Long> levelSum) {
        if (root == null) {
            return;
        }
        levelSum.put(level, levelSum.getOrDefault(level, 0L) + root.val);
        dfs(root.left, level + 1, levelSum);
        dfs(root.right, level + 1, levelSum);
    }


}
