package com.raydya;

import com.raydya.data.type.TreeNode;

public class UnivaluedBinaryTree {
    public boolean isUnivalTree(TreeNode root) {
        final int uniVal = root.val;

        return isUnival(root.left, uniVal) && isUnival(root.right, uniVal);
    }

    private boolean isUnival(TreeNode node, int uniVal) {
        if (node == null) return true;

        if (node.val == uniVal) {
            return isUnival(node.left, uniVal) && isUnival(node.right, uniVal);
        }

        return false;
    }
}
