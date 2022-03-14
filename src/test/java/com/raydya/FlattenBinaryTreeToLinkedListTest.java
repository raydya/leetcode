package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import java.util.Arrays;
import java.util.Collections;
import org.junit.Assert;
import org.junit.Test;

public class FlattenBinaryTreeToLinkedListTest {

    @Test
    public void test1() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(1, 2, 5, 3, 4, null, 6));

        final FlattenBinaryTreeToLinkedList solution = new FlattenBinaryTreeToLinkedList();
        solution.flatten(root);

        Assert.assertEquals(1, root.val);
        Assert.assertNull(root.left);
        Assert.assertEquals(2, root.right.val);
        Assert.assertNull(root.right.left);
        Assert.assertEquals(3, root.right.right.val);
        Assert.assertNull(root.right.right.left);
        Assert.assertEquals(4, root.right.right.right.val);
        Assert.assertNull(root.right.right.right.left);
        Assert.assertEquals(5, root.right.right.right.right.val);
        Assert.assertNull(root.right.right.right.right.left);
        Assert.assertEquals(6, root.right.right.right.right.right.val);
    }

    @Test
    public void test2() {
        final TreeNode root = null;

        final FlattenBinaryTreeToLinkedList solution = new FlattenBinaryTreeToLinkedList();
        solution.flatten(root);

        Assert.assertNull(root);
    }

    @Test
    public void test3() {
        final TreeNode root = TreeNodeUtil.build(Collections.singletonList(0));

        final FlattenBinaryTreeToLinkedList solution = new FlattenBinaryTreeToLinkedList();
        solution.flatten(root);

        Assert.assertEquals(0, root.val);
        Assert.assertNull(root.left);
        Assert.assertNull(root.right);
    }

    @Test
    public void test4() {
        final TreeNode root = TreeNodeUtil.build(
            Arrays.asList(4, 1, null, null, 2, null, null, null, null, null, 3));

        final FlattenBinaryTreeToLinkedList solution = new FlattenBinaryTreeToLinkedList();
        solution.flatten(root);

        Assert.assertEquals(4, root.val);
        Assert.assertNull(root.left);
        Assert.assertEquals(1, root.right.val);
        Assert.assertNull(root.right.left);
        Assert.assertEquals(2, root.right.right.val);
        Assert.assertNull(root.right.right.left);
        Assert.assertEquals(3, root.right.right.right.val);
    }

    @Test
    public void test5() {
        final TreeNode root = TreeNodeUtil.build(
            Arrays.asList(7, -10, 2, -4, 3, -8, null, null, null, null, -1, 11));

        final FlattenBinaryTreeToLinkedList solution = new FlattenBinaryTreeToLinkedList();
        solution.flatten(root);

        Assert.assertEquals(7, root.val);
        Assert.assertNull(root.left);
        Assert.assertEquals(-10, root.right.val);
        Assert.assertNull(root.right.left);
        Assert.assertEquals(-4, root.right.right.val);
        Assert.assertNull(root.right.right.left);
        Assert.assertEquals(3, root.right.right.right.val);
        Assert.assertNull(root.right.right.right.left);
        Assert.assertEquals(-1, root.right.right.right.right.val);
        Assert.assertNull(root.right.right.right.right.left);
        Assert.assertEquals(2, root.right.right.right.right.right.val);
        Assert.assertNull(root.right.right.right.right.right.left);
        Assert.assertEquals(-8, root.right.right.right.right.right.right.val);
        Assert.assertNull(root.right.right.right.right.right.right.left);
        Assert.assertEquals(11, root.right.right.right.right.right.right.right.val);
    }
}
