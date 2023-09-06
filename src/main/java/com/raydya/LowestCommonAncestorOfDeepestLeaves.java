package com.raydya;

import com.raydya.data.type.TreeNode;

public class LowestCommonAncestorOfDeepestLeaves {

    private TreeNode lowestNode = null;
    private int maxDepth = 0;

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        dfs(root, 1);
        return lowestNode;
    }

    private int dfs(TreeNode node, int depth) {
        if (node == null) {
            return depth - 1;
        }
        int maxDepthOfLeftChildren = dfs(node.left, depth + 1);
        int maxDepthOfRightChildren = dfs(node.right, depth + 1);
        if (maxDepthOfLeftChildren == maxDepthOfRightChildren && maxDepthOfLeftChildren >= maxDepth) {
            maxDepth = maxDepthOfLeftChildren;
            lowestNode = node;
        }
        return Math.max(maxDepthOfLeftChildren, maxDepthOfRightChildren);
    }

}
