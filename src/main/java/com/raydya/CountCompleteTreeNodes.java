package com.raydya;

import com.raydya.data.type.TreeNode;

public class CountCompleteTreeNodes {

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        final int left = countNodes(root.left);
        final int right = countNodes(root.right);

        return left + right + 1;
    }

}
