package com.raydya;

import com.raydya.data.type.TreeNode;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        return binaryTreePath("", root);
    }

    private List<String> binaryTreePath(String path, TreeNode node) {
        if (node == null) return Collections.emptyList();

        final String nPath = path.equals("") ? String.valueOf(node.val) : path + "->" + node.val;
        if (isChild(node)) return Collections.singletonList(nPath);

        final List<String> leftPaths = binaryTreePath(nPath, node.left);
        final List<String> rightPaths = binaryTreePath(nPath, node.right);

        return Stream.concat(leftPaths.stream(), rightPaths.stream())
            .collect(Collectors.toList());
    }

    private boolean isChild(TreeNode node) {
        return node.left == null && node.right == null;
    }
}
