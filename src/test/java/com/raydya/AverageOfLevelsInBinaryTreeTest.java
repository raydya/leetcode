package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class AverageOfLevelsInBinaryTreeTest {
    @Test
    public void test1() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(3, 9, 20, null, null, 15, 7));

        final AverageOfLevelsInBinaryTree solution = new AverageOfLevelsInBinaryTree();
        final List<Double> output = solution.averageOfLevels(root);

        Assert.assertArrayEquals(new Double[]{3.0, 14.5, 11.0}, output.toArray());
    }

    @Test
    public void test2() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(2147483647, 2147483647, 2147483647));

        final AverageOfLevelsInBinaryTree solution = new AverageOfLevelsInBinaryTree();
        final List<Double> output = solution.averageOfLevels(root);

        Assert.assertArrayEquals(new Double[]{2147483647.0, 2147483647.0}, output.toArray());
    }
}
