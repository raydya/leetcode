package com.raydya;

import com.raydya.data.type.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LCAOfBST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;

        final List<TreeNode> descendants1 = new ArrayList<>();
        final List<TreeNode> descendants2 = new ArrayList<>();
        descendants1.add(root);
        descendants2.add(root);

        getDescendants(descendants1, p);
        getDescendants(descendants2, q);

        TreeNode lca = null;

        for (int i = 0; i < descendants1.size(); i++) {
            final TreeNode n1 = descendants1.get(i);

            if (i >= descendants2.size()) break;

            final TreeNode n2 = descendants2.get(i);
            if (n1 == n2) lca = n1;
        }

        return lca;
    }

    private List<TreeNode> getDescendants(List<TreeNode> descendants, TreeNode n) {
        final TreeNode parent = descendants.get(descendants.size() - 1);
        final int pv = parent.val;
        final int nv = n.val;

        if (pv == nv) {
            return descendants;
        }

        if (nv < pv) {
            final TreeNode left = parent.left;
            descendants.add(left);
            return getDescendants(descendants, n);
        }

        final TreeNode right = parent.right;
        descendants.add(right);
        return getDescendants(descendants, n);
    }
}
