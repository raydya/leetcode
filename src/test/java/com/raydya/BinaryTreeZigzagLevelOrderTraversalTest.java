package com.raydya;

import com.raydya.data.type.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversalTest {
    @Test
    public void test1() {
        TreeNode n4 = new TreeNode(7);
        TreeNode n3 = new TreeNode(15);
        TreeNode n2 = new TreeNode(20, n3, n4);
        TreeNode n1 = new TreeNode(9);
        TreeNode root = new TreeNode(3, n1, n2);

        final BinaryTreeZigzagLevelOrderTraversal solution = new BinaryTreeZigzagLevelOrderTraversal();
        final List<List<Integer>> output = solution.zigzagLevelOrder(root);

        Assert.assertEquals(3, output.size());
        Assert.assertArrayEquals(new Integer[]{3}, output.get(0).toArray());
        Assert.assertArrayEquals(new Integer[]{20, 9}, output.get(1).toArray());
        Assert.assertArrayEquals(new Integer[]{15, 7}, output.get(2).toArray());
    }

    @Test
    public void test2() {
        TreeNode n4 = new TreeNode(5);
        TreeNode n3 = new TreeNode(4);
        TreeNode n2 = new TreeNode(3, null, n4);
        TreeNode n1 = new TreeNode(2, n3, null);
        TreeNode root = new TreeNode(1, n1, n2);

        final BinaryTreeZigzagLevelOrderTraversal solution = new BinaryTreeZigzagLevelOrderTraversal();
        final List<List<Integer>> output = solution.zigzagLevelOrder(root);

        Assert.assertEquals(3, output.size());
        Assert.assertArrayEquals(new Integer[]{1}, output.get(0).toArray());
        Assert.assertArrayEquals(new Integer[]{3, 2}, output.get(1).toArray());
        Assert.assertArrayEquals(new Integer[]{4, 5}, output.get(2).toArray());
    }

    @Test
    public void test3() {
        TreeNode n9 = new TreeNode(8);
        TreeNode n8 = new TreeNode(6);
        TreeNode n7 = new TreeNode(1);
        TreeNode n6 = new TreeNode(5);
        TreeNode n5 = new TreeNode(-1, null, n9);
        TreeNode n4 = new TreeNode(3, null, n8);
        TreeNode n3 = new TreeNode(1, n6, n7);
        TreeNode n2 = new TreeNode(4, n4, n5);
        TreeNode n1 = new TreeNode(2, n3, null);
        TreeNode root = new TreeNode(0, n1, n2);

        final BinaryTreeZigzagLevelOrderTraversal solution = new BinaryTreeZigzagLevelOrderTraversal();
        final List<List<Integer>> output = solution.zigzagLevelOrder(root);

        Assert.assertEquals(4, output.size());
        Assert.assertArrayEquals(new Integer[]{0}, output.get(0).toArray());
        Assert.assertArrayEquals(new Integer[]{4, 2}, output.get(1).toArray());
        Assert.assertArrayEquals(new Integer[]{1, 3, -1}, output.get(2).toArray());
        Assert.assertArrayEquals(new Integer[]{8, 6, 1, 5}, output.get(3).toArray());
    }
}
