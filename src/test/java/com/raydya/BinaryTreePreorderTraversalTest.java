package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinaryTreePreorderTraversalTest {
    @Test
    public void test1() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(1, null, 2, null, null, 3, null));

        final BinaryTreePreorderTraversal solution = new BinaryTreePreorderTraversal();
        final List<Integer> output = solution.preorderTraversal(root);

        Assert.assertArrayEquals(new Integer[]{1, 2, 3}, output.toArray());
    }

    @Test
    public void test2() {
        final BinaryTreePreorderTraversal solution = new BinaryTreePreorderTraversal();
        final List<Integer> output = solution.preorderTraversal(null);

        Assert.assertArrayEquals(new Integer[]{}, output.toArray());
    }

    @Test
    public void test3() {
        final TreeNode root = TreeNodeUtil.build(Collections.singletonList(1));

        final BinaryTreePreorderTraversal solution = new BinaryTreePreorderTraversal();
        final List<Integer> output = solution.preorderTraversal(root);

        Assert.assertArrayEquals(new Integer[]{1}, output.toArray());
    }

    @Test
    public void test4() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(1, 2));

        final BinaryTreePreorderTraversal solution = new BinaryTreePreorderTraversal();
        final List<Integer> output = solution.preorderTraversal(root);

        Assert.assertArrayEquals(new Integer[]{1, 2}, output.toArray());
    }

    @Test
    public void test5() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(1, null, 2));

        final BinaryTreePreorderTraversal solution = new BinaryTreePreorderTraversal();
        final List<Integer> output = solution.preorderTraversal(root);

        Assert.assertArrayEquals(new Integer[]{1, 2}, output.toArray());
    }
}
