package com.raydya;

import com.raydya.data.type.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        return traversal(root, new ArrayList<>());
    }

    private List<Integer> traversal(TreeNode node, List<Integer> holder) {
        if (node == null) return new ArrayList<>();

        final List<Integer> lt = traversal(node.left, new ArrayList<>());
        lt.add(node.val);
        final List<Integer> rt = traversal(node.right, new ArrayList<>());
        lt.addAll(rt);

        holder.addAll(lt);
        return holder;
    }
}
