package com.raydya;

import com.raydya.data.type.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> v1 = new ArrayList<>();
        List<Integer> v2 = new ArrayList<>();
        recursive(root1, v1);
        recursive(root2, v2);

        if (v1.size() != v2.size()) return false;

        for (int i = 0; i < v1.size(); i++) {
            if (!Objects.equals(v1.get(i), v2.get(i))) return false;
        }

        return true;
    }

    private void recursive(TreeNode node, List<Integer> leafValues) {
        if (node == null) return;

        if (node.left == null && node.right == null) {
            leafValues.add(node.val);
            return;
        }

        recursive(node.left, leafValues);
        recursive(node.right, leafValues);
    }
}
