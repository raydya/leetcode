package com.raydya;

import com.raydya.data.type.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        return recursion(root);
    }

    // 递归算法
    private List<Integer> recursion(TreeNode root) {
        final List<Integer> ret = new ArrayList<>();
        recursion(root, ret);
        return ret;
    }

    private void recursion(TreeNode node, List<Integer> ret) {
        if (node == null) return;

        recursion(node.left, ret);

        recursion(node.right, ret);

        ret.add(node.val);
    }
}
