package com.raydya;

import com.raydya.data.type.TreeNode;

public class SumOfRootToLeafBinaryNumbers {

    private int sum = 0;

    public int sumRootToLeaf(TreeNode root) {
        if (root == null) {
            return sum;
        }

        recursive(root, 0);

        return sum;
    }

    private void recursive(TreeNode root, int cur) {
        if (root.left == null && root.right == null) {
            sum += cur * 2 + root.val;
            return;
        }

        if (root.left != null) {
            recursive(root.left, cur * 2 + root.val);
        }
        if (root.right != null) {
            recursive(root.right, cur * 2 + root.val);
        }
    }
}
