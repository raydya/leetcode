package com.raydya;

import com.raydya.data.type.TreeNode;

public class FlattenBinaryTreeToLinkedList {
    public void flatten(TreeNode root) {
        if (root == null) return;
        TreeNode iterator = root;

        while (iterator != null) {
            final TreeNode left = iterator.left;
            final TreeNode right = iterator.right;
            if (left != null) {
                iterator.right = left;
                iterator.left = null;
                if (right != null) {
                    final TreeNode lastRightLeaf = getLastRightLeaf(left);
                    lastRightLeaf.right = right;
                }
            }
            iterator = iterator.right;
        }
    }

    private TreeNode getLastRightLeaf(TreeNode node) {
        TreeNode sentinel = node;
        while (sentinel.right != null) {
            sentinel = sentinel.right;
        }
        return sentinel;
    }
}
