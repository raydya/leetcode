package com.raydya;

import com.raydya.data.type.TreeNode;

public class BinaryTreeTilt {
    private int tilt;

    public int findTilt(TreeNode root) {
        if (root == null) return 0;

        findTilt(root.left);
        findTilt(root.right);

        int lv = root.left == null ? 0 : root.left.val;
        int rv = root.right == null ? 0 : root.right.val;

        root.val = lv + rv + root.val;

        final int t = Math.abs(lv - rv);

        tilt += t;

        return tilt;
    }
}
