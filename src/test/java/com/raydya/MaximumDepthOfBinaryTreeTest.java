package com.raydya;

import com.raydya.data.type.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class MaximumDepthOfBinaryTreeTest {

    @Test
    public void test1() {
        final TreeNode p7 = new TreeNode(7);
        final TreeNode p6 = new TreeNode(15);

        final TreeNode p3 = new TreeNode(20, p6, p7);
        final TreeNode p2 = new TreeNode(9, null, null);
        final TreeNode p1 = new TreeNode(3, p2, p3);

        final MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();
        final int depth = solution.maxDepth(p1);

        Assert.assertEquals(3, depth);
    }
}
