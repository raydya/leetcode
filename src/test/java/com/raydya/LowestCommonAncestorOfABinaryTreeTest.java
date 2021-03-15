package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class LowestCommonAncestorOfABinaryTreeTest {
    @Test
    public void test1() {
        final List<Integer> trees = Arrays.asList(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4);
        final TreeNode root = TreeNodeUtil.build(trees);

        final LowestCommonAncestorOfABinaryTree solution = new LowestCommonAncestorOfABinaryTree();
        final TreeNode output = solution.lowestCommonAncestor(root, root.left, root.right);

        Assert.assertEquals(root, output);
    }

    @Test
    public void test2() {
        final List<Integer> trees = Arrays.asList(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4);
        final TreeNode root = TreeNodeUtil.build(trees);

        final LowestCommonAncestorOfABinaryTree solution = new LowestCommonAncestorOfABinaryTree();
        final TreeNode output = solution.lowestCommonAncestor(root, root.left, root.left.right.right);

        Assert.assertEquals(root.left, output);
    }

    @Test
    public void test3() {
        final List<Integer> trees = Arrays.asList(1, 2);
        final TreeNode root = TreeNodeUtil.build(trees);

        final LowestCommonAncestorOfABinaryTree solution = new LowestCommonAncestorOfABinaryTree();
        final TreeNode output = solution.lowestCommonAncestor(root, root, root.left);

        Assert.assertEquals(root, output);
    }
}
