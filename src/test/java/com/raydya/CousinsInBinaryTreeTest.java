package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class CousinsInBinaryTreeTest {

    @Test
    public void test1() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(1, 2, 3, 4));

        final CousinsInBinaryTree solution = new CousinsInBinaryTree();
        final boolean output = solution.isCousins(root, 4, 3);

        Assert.assertFalse(output);
    }

    @Test
    public void test2() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(1, 2, 3, null, 4, null, 5));

        final CousinsInBinaryTree solution = new CousinsInBinaryTree();
        final boolean output = solution.isCousins(root, 5, 4);

        Assert.assertTrue(output);
    }

    @Test
    public void test3() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(1, 2, 3, null, 4));

        final CousinsInBinaryTree solution = new CousinsInBinaryTree();
        final boolean output = solution.isCousins(root, 2, 3);

        Assert.assertFalse(output);
    }
}
