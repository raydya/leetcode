package com.raydya;

import com.raydya.data.type.TreeNode;

public class DiameterOfBinaryTree {

    private int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return diameter;
    }

    private int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        final int l = depth(node.left);
        final int r = depth(node.right);
        diameter = Math.max(l + r, diameter);
        return Math.max(l, r) + 1;
    }
}
