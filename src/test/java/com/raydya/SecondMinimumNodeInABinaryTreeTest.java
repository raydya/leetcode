package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SecondMinimumNodeInABinaryTreeTest {
    @Test
    public void test1() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(2, 2, 5, null, null, 5, 7));

        final SecondMinimumNodeInABinaryTree solution = new SecondMinimumNodeInABinaryTree();
        final int output = solution.findSecondMinimumValue(root);

        Assert.assertEquals(5, output);
    }

    @Test
    public void test2() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(2, 2, 2));

        final SecondMinimumNodeInABinaryTree solution = new SecondMinimumNodeInABinaryTree();
        final int output = solution.findSecondMinimumValue(root);

        Assert.assertEquals(-1, output);
    }


    @Test
    public void test3() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(2, 2, 5, null, null, 5, 5));

        final SecondMinimumNodeInABinaryTree solution = new SecondMinimumNodeInABinaryTree();
        final int output = solution.findSecondMinimumValue(root);

        Assert.assertEquals(5, output);
    }
}
