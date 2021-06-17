package com.raydya;

import com.raydya.data.type.TreeNode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindModeInBinarySearchTree {
    private final Map<Integer, Integer> map = new HashMap<>();
    private int mode = Integer.MIN_VALUE;

    public int[] findMode(TreeNode root) {
        recursion(root);

        final List<Integer> modes = map.entrySet().stream()
            .filter(entry -> entry.getValue() == mode)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());

        final int[] ret = new int[modes.size()];

        for (int i = 0; i < modes.size(); i++) {
            ret[i] = modes.get(i);
        }

        return ret;
    }

    private void recursion(TreeNode node) {
        if (node == null) return;

        final int max = map.getOrDefault(node.val, 0) + 1;
        mode = Math.max(mode, max);
        map.put(node.val, max);

        recursion(node.left);

        recursion(node.right);
    }
}
