package com.raydya;

import com.raydya.data.type.TreeNode;
import java.util.Objects;

public class SubtreeOfAnotherTree {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return isSubtree(root, subRoot, false);
    }

    private boolean isSubtree(TreeNode root, TreeNode subRoot, boolean rooted) {
        if (Objects.equals(root, subRoot)) {
            return true;
        }

        if (root == null || subRoot == null) {
            return false;
        }

        if (root.val == subRoot.val) {
            if (isSubtree(root.left, subRoot.left, true) && isSubtree(root.right, subRoot.right,
                true)) {
                return true;
            }
        }

        if (rooted) {
            return false;
        }

        return isSubtree(root.left, subRoot, false) || isSubtree(root.right, subRoot, false);
    }
}
