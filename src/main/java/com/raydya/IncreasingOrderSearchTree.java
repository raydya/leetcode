package com.raydya;

import com.raydya.data.type.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class IncreasingOrderSearchTree {
//    public TreeNode increasingBST(TreeNode root) {
//        final List<Integer> bst = traversal(root, new ArrayList<>());
//
//        final TreeNode head = new TreeNode(bst.get(0));
//        TreeNode tmp = head;
//        for (int i = 1; i < bst.size(); i++) {
//            final Integer n = bst.get(i);
//            final TreeNode node = new TreeNode(n);
//            tmp.right = node;
//            tmp = tmp.right;
//        }
//
//        return head;
//    }
//
//    private List<Integer> traversal(TreeNode node, List<Integer> holder) {
//        if (node == null) return new ArrayList<>();
//
//        final List<Integer> lt = traversal(node.left, new ArrayList<>());
//        lt.add(node.val);
//        final List<Integer> rt = traversal(node.right, new ArrayList<>());
//        lt.addAll(rt);
//
//        holder.addAll(lt);
//        return holder;
//    }

    private TreeNode resNode;

    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummyNode = new TreeNode(-1);
        resNode = dummyNode;
        inorder(root);
        return dummyNode.right;
    }

    public void inorder(TreeNode node) {
        if (node == null) {
            return;
        }
        inorder(node.left);

        // 在中序遍历的过程中修改节点指向
        resNode.right = node;
        node.left = null;
        resNode = node;

        inorder(node.right);
    }
}
