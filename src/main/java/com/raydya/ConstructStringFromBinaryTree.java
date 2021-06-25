package com.raydya;

import com.raydya.data.type.TreeNode;

public class ConstructStringFromBinaryTree {
    public String tree2str(TreeNode root) {
        final String str = recursion(root);
        return str.substring(1, str.length() - 1);
    }

    private String recursion(TreeNode node) {
        if (node == null) return "";

        if (node.left == null && node.right == null) {
            return "(" + node.val + ")";
        }

        if (node.left == null) {
            return "(" + node.val + "()" + recursion(node.right) + ")";
        }

        if (node.right == null) {
            return "(" + node.val + recursion(node.left) + ")";
        }

        return "(" + node.val + recursion(node.left) + recursion(node.right) + ")";
    }
}
