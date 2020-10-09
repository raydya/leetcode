package com.raydya;

import com.raydya.data.type.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class MinimumDepthOfBinaryTreeTest {

    @Test
    public void test1() {
        final TreeNode n4 = new TreeNode(7);
        final TreeNode n3 = new TreeNode(15);
        final TreeNode n2 = new TreeNode(20, n3, n4);
        final TreeNode n1 = new TreeNode(9);
        final TreeNode root = new TreeNode(3, n1, n2);

        final MinimumDepthOfBinaryTree solution = new MinimumDepthOfBinaryTree();
        final int minDepth = solution.minDepth(root);

        Assert.assertEquals(2, minDepth);
    }

    @Test
    public void test2() {
        final TreeNode n1 = new TreeNode(2);
        final TreeNode root = new TreeNode(1, n1, null);

        final MinimumDepthOfBinaryTree solution = new MinimumDepthOfBinaryTree();
        final int minDepth = solution.minDepth(root);

        Assert.assertEquals(2, minDepth);
    }

    @Test
    public void test3() {
        final TreeNode n4 = new TreeNode(5);
        final TreeNode n3 = new TreeNode(4, n4, null);
        final TreeNode n2 = new TreeNode(3, n3, null);
        final TreeNode n1 = new TreeNode(2, n2, null);
        final TreeNode root = new TreeNode(1, n1, null);

        final MinimumDepthOfBinaryTree solution = new MinimumDepthOfBinaryTree();
        final int minDepth = solution.minDepth(root);

        Assert.assertEquals(5, minDepth);
    }
}
