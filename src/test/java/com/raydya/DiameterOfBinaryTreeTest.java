package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class DiameterOfBinaryTreeTest {
    @Test
    public void test1() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(1, 2, 3, 4, 5));

        final DiameterOfBinaryTree solution = new DiameterOfBinaryTree();
        final int output = solution.diameterOfBinaryTree(root);

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final TreeNode root = TreeNodeUtil.build(Collections.singletonList(1));

        final DiameterOfBinaryTree solution = new DiameterOfBinaryTree();
        final int output = solution.diameterOfBinaryTree(root);

        Assert.assertEquals(0, output);
    }
}
