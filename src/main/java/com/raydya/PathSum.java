package com.raydya;

import com.raydya.data.type.TreeNode;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;

        final int s = sum - root.val;

        if (s == 0 && root.left == null && root.right == null) return true;

        final boolean l = hasPathSum(root.left, s);
        final boolean r = hasPathSum(root.right, s);

        return l || r;
    }
}
