package com.raydya;

import com.raydya.data.type.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class BalancedBinaryTreeTest {

    @Test
    public void test1() {
        final TreeNode n4 = new TreeNode(7);
        final TreeNode n3 = new TreeNode(15);
        final TreeNode n2 = new TreeNode(20, n3, n4);
        final TreeNode n1 = new TreeNode(9);
        final TreeNode root = new TreeNode(3, n1, n2);

        final BalancedBinaryTree solution = new BalancedBinaryTree();
        final boolean isBalanced = solution.isBalanced(root);

        Assert.assertTrue(isBalanced);
    }

    @Test
    public void test2() {
        final TreeNode n6 = new TreeNode(4);
        final TreeNode n5 = new TreeNode(4);
        final TreeNode n4 = new TreeNode(3);
        final TreeNode n3 = new TreeNode(3, n5, n6);
        final TreeNode n2 = new TreeNode(2);
        final TreeNode n1 = new TreeNode(2, n3, n4);
        final TreeNode root = new TreeNode(1, n1, n2);

        final BalancedBinaryTree solution = new BalancedBinaryTree();
        final boolean isBalanced = solution.isBalanced(root);

        Assert.assertFalse(isBalanced);
    }

    @Test
    public void test3() {
        final BalancedBinaryTree solution = new BalancedBinaryTree();
        final boolean isBalanced = solution.isBalanced(null);

        Assert.assertTrue(isBalanced);
    }

    @Test
    public void test4() {
        final TreeNode n6 = new TreeNode(4);
        final TreeNode n5 = new TreeNode(4);

        final TreeNode n4 = new TreeNode(3, null, n6);
        final TreeNode n3 = new TreeNode(3, n5, null);

        final TreeNode n2 = new TreeNode(2, null, n4);
        final TreeNode n1 = new TreeNode(2, n3, null);

        final TreeNode root = new TreeNode(1, n1, n2);

        final BalancedBinaryTree solution = new BalancedBinaryTree();
        final boolean isBalanced = solution.isBalanced(root);

        Assert.assertFalse(isBalanced);
    }
}
