package com.raydya;

import com.raydya.data.type.TreeNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TwoSumIVInputIsABST {
    private final Map<Integer, Boolean> map = new HashMap<>();

    public boolean findTarget(TreeNode root, int k) {
        return recursion(root, k);
    }

    private boolean recursion(TreeNode node, int k) {
        if (node == null) return false;

        final int m = k - node.val;

        if (Objects.equals(Boolean.TRUE, map.get(m))) return true;

        map.put(node.val, true);

        return recursion(node.left, k) || recursion(node.right, k);
    }
}
