package com.raydya;

import com.raydya.data.type.TreeNode;

public class SearchInABinarySearchTree {

    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode node = root;

        while (node != null) {
            if (node.val == val) {
                break;
            }
            if (node.val > val) {
                node = node.left;
            } else {
                node = node.right;
            }
        }

        return node;
    }
}
