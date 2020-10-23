package com.raydya;

import com.raydya.data.type.TreeNode;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        final TreeNode left = root.left;
        final TreeNode right = root.right;
        root.right = left;
        root.left = right;

        invertTree(left);
        invertTree(right);

        return root;
    }
}
