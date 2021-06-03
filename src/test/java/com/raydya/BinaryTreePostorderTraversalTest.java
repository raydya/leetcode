package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class BinaryTreePostorderTraversalTest {
    @Test
    public void test1() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(1, null, 2, null, null, 3));

        final BinaryTreePostorderTraversal solution = new BinaryTreePostorderTraversal();
        final List<Integer> output = solution.postorderTraversal(root);

        Assert.assertArrayEquals(new Integer[]{3, 2, 1}, output.toArray());
    }


    @Test
    public void test2() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(3, 1, 2));

        final BinaryTreePostorderTraversal solution = new BinaryTreePostorderTraversal();
        final List<Integer> output = solution.postorderTraversal(root);

        Assert.assertArrayEquals(new Integer[]{1, 2, 3}, output.toArray());
    }
}
