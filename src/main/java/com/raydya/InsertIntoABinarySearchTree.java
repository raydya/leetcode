package com.raydya;

import com.raydya.data.type.TreeNode;

public class InsertIntoABinarySearchTree {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        recursive(root, val);
        return root;
    }

    private void recursive(TreeNode node, int val) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.val > val) {
            node.left = new TreeNode(val);
            return;
        }

        if (node.right == null && node.val < val) {
            node.right = new TreeNode(val);
            return;
        }

        if (node.val > val) {
            recursive(node.left, val);
        } else {
            recursive(node.right, val);
        }
    }

}
