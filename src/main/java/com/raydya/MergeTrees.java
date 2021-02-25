package com.raydya;

import com.raydya.data.type.TreeNode;

public class MergeTrees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return null;
        return merge(root1, root2);
    }

    public TreeNode merge(TreeNode r1, TreeNode r2) {
        if (r1 == null && r2 == null) return null;

        final TreeNode root = new TreeNode();
        final int i = r1 != null ? r1.val : 0;
        final int j = r2 != null ? r2.val : 0;
        root.val = i + j;

        final TreeNode l = merge(r1 != null ? r1.left : null, r2 != null ? r2.left : null);
        final TreeNode r = merge(r1 != null ? r1.right : null, r2 != null ? r2.right : null);

        if (l != null) root.left = l;
        if (r != null) root.right = r;

        return root;
    }
}
