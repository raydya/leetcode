package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class FindModeInBinarySearchTreeTest {
    @Test
    public void test1() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(1, null, 2, null, null, 2));

        final FindModeInBinarySearchTree solution = new FindModeInBinarySearchTree();
        final int[] output = solution.findMode(root);

        Assert.assertArrayEquals(new int[]{2}, output);
    }
}
