package com.raydya;

import com.raydya.data.type.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class PathSumTest {
    @Test
    public void test1() {
        final TreeNode n8 = new TreeNode(1);
        final TreeNode n7 = new TreeNode(2);
        final TreeNode n6 = new TreeNode(7);

        final TreeNode n5 = new TreeNode(4, null, n8);
        final TreeNode n4 = new TreeNode(13);
        final TreeNode n3 = new TreeNode(11, n6, n7);

        final TreeNode n2 = new TreeNode(8, n4, n5);
        final TreeNode n1 = new TreeNode(4, n3, null);

        final TreeNode root = new TreeNode(5, n1, n2);

        final PathSum solution = new PathSum();
        final boolean hasPathSum = solution.hasPathSum(root, 22);

        Assert.assertTrue(hasPathSum);
    }

    @Test
    public void test2() {
        final PathSum solution = new PathSum();
        final boolean hasPathSum = solution.hasPathSum(null, 0);

        Assert.assertFalse(hasPathSum);
    }

    @Test
    public void test3() {
        final TreeNode n1 = new TreeNode(2);
        final TreeNode root = new TreeNode(1, n1, null);

        final PathSum solution = new PathSum();
        final boolean hasPathSum = solution.hasPathSum(root, 1);

        Assert.assertFalse(hasPathSum);
    }
}
