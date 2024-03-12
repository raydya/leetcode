package com.raydya;

import com.raydya.FindElementsInAContaminatedBinaryTree.FindElements;
import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class FindElementsInAContaminatedBinaryTreeTest {

    @Test
    public void test1() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(-1, null, -1));
        final FindElements solution = new FindElements(root);
        final boolean r1 = solution.find(1);
        Assert.assertFalse(r1);
        final boolean r2 = solution.find(2);
        Assert.assertTrue(r2);
    }

    @Test
    public void test2() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(-1, -1, -1, -1, -1));
        final FindElements solution = new FindElements(root);
        final boolean r1 = solution.find(1);
        Assert.assertTrue(r1);
        final boolean r2 = solution.find(3);
        Assert.assertTrue(r2);
        final boolean r3 = solution.find(5);
        Assert.assertFalse(r3);
    }

    @Test
    public void test3() {
        final TreeNode root = new TreeNode();
        root.val = -1;
        root.right = new TreeNode(-1);
        root.right.left = new TreeNode(-1);
        root.right.left.left = new TreeNode(-1);
        final FindElements solution = new FindElements(root);
        final boolean r1 = solution.find(2);
        Assert.assertTrue(r1);
        final boolean r2 = solution.find(3);
        Assert.assertFalse(r2);
        final boolean r3 = solution.find(4);
        Assert.assertFalse(r3);
        final boolean r4 = solution.find(5);
        Assert.assertTrue(r4);
    }
}
