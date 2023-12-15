package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ReverseOddLevelsOfBinaryTreeTest {

    @Test
    public void test1() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(2, 3, 5, 8, 13, 21, 34));

        final ReverseOddLevelsOfBinaryTree solution = new ReverseOddLevelsOfBinaryTree();
        final TreeNode output = solution.reverseOddLevels(root);

        Assert.assertEquals(2, output.val);
        Assert.assertEquals(5, output.left.val);
        Assert.assertEquals(3, output.right.val);
        Assert.assertEquals(8, output.left.left.val);
        Assert.assertEquals(13, output.left.right.val);
        Assert.assertEquals(21, output.right.left.val);
        Assert.assertEquals(34, output.right.right.val);
    }

    @Test
    public void test2() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(7, 13, 11));

        final ReverseOddLevelsOfBinaryTree solution = new ReverseOddLevelsOfBinaryTree();
        final TreeNode output = solution.reverseOddLevels(root);

        Assert.assertEquals(7, output.val);
        Assert.assertEquals(11, output.left.val);
        Assert.assertEquals(13, output.right.val);
    }

    @Test
    public void test3() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(0, 1, 2, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2));

        final ReverseOddLevelsOfBinaryTree solution = new ReverseOddLevelsOfBinaryTree();
        final TreeNode output = solution.reverseOddLevels(root);

        Assert.assertEquals(0, output.val);
        Assert.assertEquals(2, output.left.val);
        Assert.assertEquals(1, output.right.val);
        Assert.assertEquals(0, output.left.left.val);
        Assert.assertEquals(0, output.left.right.val);
        Assert.assertEquals(0, output.right.left.val);
        Assert.assertEquals(0, output.right.right.val);
        Assert.assertEquals(2, output.left.left.left.val);
        Assert.assertEquals(2, output.left.left.right.val);
        Assert.assertEquals(2, output.left.right.left.val);
        Assert.assertEquals(2, output.left.right.right.val);
        Assert.assertEquals(1, output.right.left.left.val);
        Assert.assertEquals(1, output.right.left.right.val);
        Assert.assertEquals(1, output.right.right.left.val);
        Assert.assertEquals(1, output.right.right.right.val);
    }

}
