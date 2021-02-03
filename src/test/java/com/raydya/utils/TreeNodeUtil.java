package com.raydya.utils;

import com.raydya.data.type.TreeNode;

import java.util.List;

public class TreeNodeUtil {
    public static TreeNode build(List<Integer> vals) {
        if (vals == null || vals.size() == 0) return null;
        final Integer val = vals.get(0);
        if (val == null) return null;
        final TreeNode root = new TreeNode(val);
        root.left = buildSub(vals, 1, 1, 1);
        root.right = buildSub(vals, 2, 1, 1);
        return root;
    }

    private static TreeNode buildSub(List<Integer> vals, int index, int level, int levelStart) {
        if (index >= vals.size()) return null;
        final Integer val = vals.get(index);
        if (val == null) return null;
        final TreeNode node = new TreeNode(val);
        final int capacity = (int) Math.pow(2, level);
        final int offset = index - levelStart;
        final int nextLevelStart = levelStart + capacity;
        final int leftIndex = offset * 2 + nextLevelStart;
        final int rightIndex = offset * 2 + 1 + nextLevelStart;
        node.left = buildSub(vals, leftIndex, level + 1, nextLevelStart);
        node.right = buildSub(vals, rightIndex, level + 1, nextLevelStart);
        return node;
    }
}
