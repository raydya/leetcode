package com.raydya;

import com.raydya.data.type.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CousinsInBinaryTreeII {

    public TreeNode replaceValueInTree(TreeNode root) {
        final Map<Integer, Integer> map = new HashMap<>();
        final Map<Integer, List<TreeNode>> nMap = new HashMap<>();
        final Map<TreeNode, Integer> fMap = new HashMap<>();
        map.put(0, root.val);
        nMap.computeIfAbsent(0, k -> new ArrayList<>()).add(root);
        fMap.put(root, root.val);
        dfs(root, 0, map, fMap, nMap);

        for (final Map.Entry<Integer, List<TreeNode>> entry : nMap.entrySet()) {
            final List<TreeNode> nodes = entry.getValue();
            final int level = entry.getKey();
            if (level < 2) {
                continue;
            }
            for (final TreeNode node : nodes) {
                final int sum = map.get(level);
                final int f = fMap.get(node);
                node.val = sum - f;
            }
        }

        return root;
    }

    private void dfs(final TreeNode root, int level, final Map<Integer, Integer> map,
        final Map<TreeNode, Integer> fMap, final Map<Integer, List<TreeNode>> nMap) {
        if (root == null) {
            return;
        }
        if (level < 2) {
            root.val = 0;
        }
        int sum = 0;
        if (root.left != null) {
            map.put(level + 1, map.getOrDefault(level + 1, 0) + root.left.val);
            nMap.computeIfAbsent(level + 1, k -> new ArrayList<>()).add(root.left);
            sum += root.left.val;
        }
        if (root.right != null) {
            map.put(level + 1, map.getOrDefault(level + 1, 0) + root.right.val);
            nMap.computeIfAbsent(level + 1, k -> new ArrayList<>()).add(root.right);
            sum += root.right.val;
        }
        if (root.left != null) {
            fMap.put(root.left, sum);
        }
        if (root.right != null) {
            fMap.put(root.right, sum);
        }

        dfs(root.left, level + 1, map, fMap, nMap);
        dfs(root.right, level + 1, map, fMap, nMap);

    }

}
