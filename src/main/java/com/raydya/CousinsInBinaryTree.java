package com.raydya;

import com.raydya.data.type.TreeNode;

public class CousinsInBinaryTree {
    private TreeNode p1;
    private TreeNode p2;
    private int l1;
    private int l2;

    public boolean isCousins(TreeNode root, int x, int y) {
        iterator(root.left, x, y, 0, root);
        iterator(root.right, x, y, 0, root);

        return l1 == l2 && p1 != p2;
    }

    private void iterator(TreeNode node, int x, int y, int level, TreeNode parent) {
        if (node == null) return;

        if (node.val == x) {
            p1 = parent;
            l1 = level + 1;
        }

        if (node.val == y) {
            p2 = parent;
            l2 = level + 1;
        }

        iterator(node.left, x, y, level + 1, node);
        iterator(node.right, x, y, level + 1, node);
    }
}
