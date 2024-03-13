package com.raydya.utils;

import com.raydya.data.type.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TreeNodeUtilTest {

    @Test
    public void test1() {
        List<Integer> vals = Arrays.asList(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, null, 5, 1);
        final TreeNode root = TreeNodeUtil.build(vals);

        Assert.assertEquals(5, root.val);
        Assert.assertEquals(4, root.left.val);
        Assert.assertEquals(8, root.right.val);
        Assert.assertEquals(11, root.left.left.val);
        Assert.assertNull(root.left.right);
        Assert.assertEquals(7, root.left.left.left.val);
        Assert.assertEquals(2, root.left.left.right.val);
        Assert.assertEquals(13, root.right.left.val);
        Assert.assertEquals(4, root.right.right.val);
        Assert.assertEquals(5, root.right.right.left.val);
        Assert.assertEquals(1, root.right.right.right.val);
    }

    @Test
    public void test2() {
        List<Integer> vals = Arrays.asList(1, 2, 3);
        final TreeNode root = TreeNodeUtil.build(vals);

        Assert.assertEquals(1, root.val);
        Assert.assertEquals(2, root.left.val);
        Assert.assertEquals(3, root.right.val);
    }

    @Test
    public void test3() {
        List<Integer> vals = Arrays.asList(1, 2);
        final TreeNode root = TreeNodeUtil.build(vals);

        Assert.assertEquals(1, root.val);
        Assert.assertEquals(2, root.left.val);
    }

    @Test
    public void test4() {
        List<Integer> vals = Arrays.asList(1, 2, null, 3, 4, null, null, 5);
        final TreeNode root = TreeNodeUtil.build(vals);

        Assert.assertEquals(1, root.val);
        Assert.assertEquals(2, root.left.val);
        Assert.assertNull(root.right);
        Assert.assertEquals(3, root.left.left.val);
        Assert.assertEquals(4, root.left.right.val);
        Assert.assertEquals(5, root.left.left.left.val);
    }
}
