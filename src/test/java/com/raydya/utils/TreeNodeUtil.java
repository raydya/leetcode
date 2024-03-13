package com.raydya.utils;

import com.raydya.data.type.TreeNode;

import java.util.List;

public class TreeNodeUtil {

    public static TreeNode build(List<Integer> values) {
        if (values == null || values.size() == 0) {
            return null;
        }
        TreeNode root = createTree(values, 0);
        return root;
    }

    public static TreeNode createTree(List<Integer> values, int index) {
        if (index >= values.size()) {
            return null;
        }

        Integer value = values.get(index);
        if (value == null) {
            return null;
        }

        TreeNode tree = new TreeNode(value);

        // tree(index).left = 2 * index + 1
        tree.left = createTree(values, index * 2 + 1);

        // tree(index).right = 2 * index + 2
        tree.right = createTree(values, index * 2 + 2);

        return tree;

    }

}
