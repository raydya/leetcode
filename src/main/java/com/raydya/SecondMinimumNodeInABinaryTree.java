package com.raydya;

import com.raydya.data.type.TreeNode;

public class SecondMinimumNodeInABinaryTree {

    public int findSecondMinimumValue(TreeNode root) {
        //当前节点为空或者当前节点为叶子节点 说明以root为根节点的子树 没有第二小的值 返回-1
        if (root == null || (root.left == null && root.right == null)) {
            return -1;
        }
        int l = root.left.val;
        int r = root.right.val;
        if (root.val == root.left.val) {
            l = findSecondMinimumValue(root.left);//找root左孩子的子树的第二小的值
        }
        if (root.val == root.right.val) {
            r = findSecondMinimumValue(root.right);//找root右孩子的子树的第二小的值
        }
        if (l != -1 && r != -1) {
            return Math.min(l, r);//左右孩子都有值 返回最小的
        }
        if (l != -1) {
            return l;//左孩子有值 但是右孩子没有 返回左孩子
        }
        return r;//左孩子没有值，返回右孩子的值 或者r =-1
    }
}
