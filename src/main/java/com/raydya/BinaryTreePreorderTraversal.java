package com.raydya;

import com.raydya.data.type.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
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

        ret.add(node.val);

        recursion(node.left, ret);

        recursion(node.right, ret);
    }

    // 迭代算法
    private List<Integer> iterator(TreeNode root) {
        final LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode node = root;
        final List<Integer> ret = new ArrayList<>();

        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                ret.add(node.val);
                stack.push(node);
                node = node.left;
            } else {
                final TreeNode pop = stack.pop();
                node = pop.right;
            }
        }

        return ret;
    }
}
