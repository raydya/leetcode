package com.raydya;

import com.raydya.data.type.TreeNode;

public class BinarySearchTreeToGreaterSumTree {

    public TreeNode bstToGst(TreeNode root) {
        dfs(root, 0);
        return root;
    }

    private int dfs(TreeNode node, int k) {
        if (node == null) {
            return k;
        }

        final int r = dfs(node.right, k);
        final int v = node.val;
        node.val += r;
        final int l = dfs(node.left, node.val);

        return l == 0 ? v : l;
    }
}
