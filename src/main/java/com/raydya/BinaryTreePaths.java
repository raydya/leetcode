package com.raydya;

import com.raydya.data.type.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        return binaryTreePath("", root);
    }

    private List<String> binaryTreePath(String path, TreeNode node) {
        if (node == null) {
            return new ArrayList<>();
        }

        final String nPath = path.equals("") ? String.valueOf(node.val) : path + "->" + node.val;
        if (isChild(node)) {
            final ArrayList<String> singleton = new ArrayList<>();
            singleton.add(nPath);
            return singleton;
        }

        final List<String> leftPaths = binaryTreePath(nPath, node.left);
        final List<String> rightPaths = binaryTreePath(nPath, node.right);

        leftPaths.addAll(rightPaths);

        return leftPaths;
    }

    private boolean isChild(TreeNode node) {
        return node.left == null && node.right == null;
    }
}
