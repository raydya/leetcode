package com.raydya;

import com.raydya.data.type.TreeNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreePostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
//        return recursion(root);
        return iterator(root);
    }

    // 递归算法
    private List<Integer> recursion(TreeNode root) {
        final List<Integer> ret = new ArrayList<>();
        recursion(root, ret);
        return ret;
    }

    private void recursion(TreeNode node, List<Integer> ret) {
        if (node == null) {
            return;
        }

        recursion(node.left, ret);

        recursion(node.right, ret);

        ret.add(node.val);
    }

    // 迭代算法
    private List<Integer> iterator(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        final LinkedList<TreeNode> stack = new LinkedList<>();

        TreeNode node = root;
        final LinkedList<Integer> ret = new LinkedList<>();

        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                ret.push(node.val);
                stack.push(node);
                node = node.right;
            } else {
                final TreeNode pop = stack.pop();
                node = pop.left;
            }
        }

        return ret;
    }
}
