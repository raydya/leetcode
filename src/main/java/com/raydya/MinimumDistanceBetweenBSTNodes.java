package com.raydya;

import com.raydya.data.type.TreeNode;

public class MinimumDistanceBetweenBSTNodes {
    private int minVal = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        iterator(root);

        return minVal;
    }

    private void iterator(TreeNode node) {
        if (node == null) return;

        final int max = getMax(node.left);
        minVal = Math.min(Math.abs(node.val - max), minVal);

        final int min = getMin(node.right);
        minVal = Math.min(Math.abs(min - node.val), minVal);

        iterator(node.left);
        iterator(node.right);
    }

    private int getMax(TreeNode node) {
        if (node == null) return Integer.MAX_VALUE;

        int max = node.val;
        TreeNode tmp = node;
        while (tmp != null && tmp.right != null) {
            tmp = tmp.right;
            max = Math.max(max, tmp.val);
        }
        return max;
    }

    private int getMin(TreeNode node) {
        if (node == null) return Integer.MAX_VALUE;

        int min = node.val;
        TreeNode tmp = node;
        while (tmp != null && tmp.left != null) {
            tmp = tmp.left;
            min = Math.min(min, tmp.val);
        }
        return min;
    }
}
