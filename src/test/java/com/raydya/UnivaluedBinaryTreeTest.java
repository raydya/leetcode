package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class UnivaluedBinaryTreeTest {

    @Test
    public void test1() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(1, 1, 1, 1, 1, null, 1));

        final UnivaluedBinaryTree solution = new UnivaluedBinaryTree();
        final boolean output = solution.isUnivalTree(root);

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(2, 2, 2, 5, 2));

        final UnivaluedBinaryTree solution = new UnivaluedBinaryTree();
        final boolean output = solution.isUnivalTree(root);

        Assert.assertFalse(output);
    }
}
