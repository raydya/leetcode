package com.raydya;

import com.raydya.data.type.TreeNode;

public class MergeTwoBinaryTrees {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        }

        final int v1 = root1 == null ? 0 : root1.val;
        final int v2 = root2 == null ? 0 : root2.val;

        final TreeNode node = new TreeNode(v1 + v2);

        node.left = mergeTrees(root1 == null ? null : root1.left, root2 == null ? null : root2.left);
        node.right = mergeTrees(root1 == null ? null : root1.right, root2 == null ? null : root2.right);

        return node;
    }

}
