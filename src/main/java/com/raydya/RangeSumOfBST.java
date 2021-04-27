package com.raydya;

import com.raydya.data.type.TreeNode;

public class RangeSumOfBST {
    int sum = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        iterator(root, low, high);
        return sum;
    }

    private void iterator(TreeNode node, int low, int high) {
        if (node == null) return;

        final int v = node.val;
        if (v < low) {
            iterator(node.right, low, high);
        } else if (v > high) {
            iterator(node.left, low, high);
        } else {
            sum += v;
            iterator(node.left, low, high);
            iterator(node.right, low, high);
        }
    }
}
