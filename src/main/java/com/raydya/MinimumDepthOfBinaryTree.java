package com.raydya;

import com.raydya.data.type.TreeNode;

public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        final int mLeft = minDepth(root.left);
        final int mRight = minDepth(root.right);

        if (mLeft > 0 && mRight > 0) {
            return 1 + Math.min(mLeft, mRight);
        }

        return 1 + Math.max(mLeft, mRight);
    }
}
