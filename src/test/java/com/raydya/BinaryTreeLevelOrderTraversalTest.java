package com.raydya;

import com.raydya.data.type.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class BinaryTreeLevelOrderTraversalTest {
    @Test
    public void test1() {
        TreeNode n4 = new TreeNode(7);
        TreeNode n3 = new TreeNode(15);
        TreeNode n2 = new TreeNode(20, n3, n4);
        TreeNode n1 = new TreeNode(9);
        TreeNode root = new TreeNode(3, n1, n2);

        final BinaryTreeLevelOrderTraversal solution = new BinaryTreeLevelOrderTraversal();
        final List<List<Integer>> output = solution.levelOrder(root);

        Assert.assertEquals(3, output.size());
        Assert.assertArrayEquals(new Integer[]{3}, output.get(0).toArray());
        Assert.assertArrayEquals(new Integer[]{9, 20}, output.get(1).toArray());
        Assert.assertArrayEquals(new Integer[]{15, 7}, output.get(2).toArray());
    }

    @Test
    public void test2() {
        final BinaryTreeLevelOrderTraversal solution = new BinaryTreeLevelOrderTraversal();
        final List<List<Integer>> output = solution.levelOrder(null);

        Assert.assertArrayEquals(new Integer[]{}, output.toArray());
    }

    @Test
    public void test3() {
        TreeNode n1 = new TreeNode(2);
        TreeNode root = new TreeNode(1, n1, null);

        final BinaryTreeLevelOrderTraversal solution = new BinaryTreeLevelOrderTraversal();
        final List<List<Integer>> output = solution.levelOrder(root);

        Assert.assertEquals(2, output.size());
        Assert.assertArrayEquals(new Integer[]{1}, output.get(0).toArray());
        Assert.assertArrayEquals(new Integer[]{2}, output.get(1).toArray());
    }
}
