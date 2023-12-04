package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BinarySearchTreeToGreaterSumTreeTest {

    @Test
    public void test1() {
        final TreeNode root = TreeNodeUtil.build(
            Arrays.asList(4, 1, 6, 0, 2, 5, 7, null, null, null, 3, null, null, null, 8));

        final BinarySearchTreeToGreaterSumTree solution = new BinarySearchTreeToGreaterSumTree();
        final TreeNode res = solution.bstToGst(root);

        Assert.assertEquals(30, res.val);
        Assert.assertEquals(36, res.left.val);
        Assert.assertEquals(21, res.right.val);
        Assert.assertEquals(36, res.left.left.val);
        Assert.assertNull(res.left.left.left);
        Assert.assertNull(res.left.left.right);
        Assert.assertEquals(35, res.left.right.val);
        Assert.assertNull(res.left.right.left);
        Assert.assertEquals(33, res.left.right.right.val);
        Assert.assertEquals(26, res.right.left.val);
        Assert.assertNull(res.right.left.left);
        Assert.assertNull(res.right.left.right);
        Assert.assertEquals(15, res.right.right.val);
        Assert.assertNull(res.right.right.left);
        Assert.assertEquals(8, res.right.right.right.val);
    }

    @Test
    public void test2() {
        final TreeNode root = TreeNodeUtil.build(
            Arrays.asList(0, null, 1));

        final BinarySearchTreeToGreaterSumTree solution = new BinarySearchTreeToGreaterSumTree();
        final TreeNode res = solution.bstToGst(root);

        Assert.assertEquals(1, res.val);
        Assert.assertNull(res.left);
        Assert.assertEquals(1, res.right.val);
    }

}
