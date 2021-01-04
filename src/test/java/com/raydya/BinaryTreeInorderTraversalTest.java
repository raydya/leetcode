package com.raydya;

import com.raydya.data.type.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class BinaryTreeInorderTraversalTest {
    @Test
    public void test1() {
        final TreeNode n2 = new TreeNode(3);
        final TreeNode n1 = new TreeNode(2, n2, null);
        final TreeNode root = new TreeNode(1, null, n1);

        final BinaryTreeInorderTraversal solution = new BinaryTreeInorderTraversal();
        final List<Integer> output = solution.inorderTraversal(root);

        Assert.assertArrayEquals(new Integer[]{1, 3, 2}, output.toArray());
    }

    @Test
    public void test2() {
        final BinaryTreeInorderTraversal solution = new BinaryTreeInorderTraversal();
        final List<Integer> output = solution.inorderTraversal(null);

        Assert.assertArrayEquals(new Integer[]{}, output.toArray());
    }

    @Test
    public void test3() {
        final TreeNode root = new TreeNode(1);

        final BinaryTreeInorderTraversal solution = new BinaryTreeInorderTraversal();
        final List<Integer> output = solution.inorderTraversal(root);

        Assert.assertArrayEquals(new Integer[]{1}, output.toArray());
    }

    @Test
    public void test4() {
        final TreeNode n1 = new TreeNode(2);
        final TreeNode root = new TreeNode(1, n1, null);

        final BinaryTreeInorderTraversal solution = new BinaryTreeInorderTraversal();
        final List<Integer> output = solution.inorderTraversal(root);

        Assert.assertArrayEquals(new Integer[]{2, 1}, output.toArray());
    }

    @Test
    public void test5() {
        final TreeNode n1 = new TreeNode(2);
        final TreeNode root = new TreeNode(1, null, n1);

        final BinaryTreeInorderTraversal solution = new BinaryTreeInorderTraversal();
        final List<Integer> output = solution.inorderTraversal(root);

        Assert.assertArrayEquals(new Integer[]{1, 2}, output.toArray());
    }
}
