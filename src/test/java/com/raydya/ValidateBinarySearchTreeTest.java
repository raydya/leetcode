package com.raydya;

import com.raydya.data.type.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class ValidateBinarySearchTreeTest {
    @Test
    public void test1() {
        final TreeNode right = new TreeNode(3);
        final TreeNode left = new TreeNode(1);
        final TreeNode root = new TreeNode(2, left, right);

        final ValidateBinarySearchTree solution = new ValidateBinarySearchTree();
        final boolean validBST = solution.isValidBST(root);

        Assert.assertTrue(validBST);
    }

    @Test
    public void test2() {
        final TreeNode tn4 = new TreeNode(6);
        final TreeNode tn3 = new TreeNode(3);
        final TreeNode tn2 = new TreeNode(4, tn3, tn4);
        final TreeNode tn1 = new TreeNode(1);
        final TreeNode root = new TreeNode(5, tn1, tn2);

        final ValidateBinarySearchTree solution = new ValidateBinarySearchTree();
        final boolean validBST = solution.isValidBST(root);

        Assert.assertFalse(validBST);
    }
}
