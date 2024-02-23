package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class KthLargestSumInABinaryTreeTest {

    @Test
    public void test1() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(5, 8, 9, 2, 1, 3, 7, 4, 6));

        final KthLargestSumInABinaryTree solution = new KthLargestSumInABinaryTree();
        final long output = solution.kthLargestLevelSum(root, 2);

        Assert.assertEquals(13, output);
    }

    @Test
    public void test2() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(1, 2, null, 3));

        final KthLargestSumInABinaryTree solution = new KthLargestSumInABinaryTree();
        final long output = solution.kthLargestLevelSum(root, 1);

        Assert.assertEquals(3, output);
    }
}
