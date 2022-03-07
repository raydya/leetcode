package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class InsertIntoABinarySearchTreeTest {

    @Test
    public void test1() {
        final TreeNode head = TreeNodeUtil.build(Arrays.asList(4, 2, 7, 1, 3));

        final InsertIntoABinarySearchTree solution = new InsertIntoABinarySearchTree();
        final TreeNode output = solution.insertIntoBST(head, 5);

        Assert.assertEquals(4, output.val);
        Assert.assertEquals(2, output.left.val);
        Assert.assertEquals(7, output.right.val);
        Assert.assertEquals(1, output.left.left.val);
        Assert.assertEquals(3, output.left.right.val);
        Assert.assertEquals(5, output.right.left.val);
    }

    @Test
    public void test2() {
        final TreeNode head = TreeNodeUtil.build(Arrays.asList(40, 20, 60, 10, 30, 50, 70));

        final InsertIntoABinarySearchTree solution = new InsertIntoABinarySearchTree();
        final TreeNode output = solution.insertIntoBST(head, 25);

        Assert.assertEquals(40, output.val);
        Assert.assertEquals(20, output.left.val);
        Assert.assertEquals(60, output.right.val);
        Assert.assertEquals(10, output.left.left.val);
        Assert.assertEquals(30, output.left.right.val);
        Assert.assertEquals(50, output.right.left.val);
        Assert.assertEquals(70, output.right.right.val);
        Assert.assertNull(output.left.left.left);
        Assert.assertNull(output.left.left.right);
        Assert.assertEquals(25, output.left.right.left.val);
    }

    @Test
    public void test3() {
        final TreeNode head = TreeNodeUtil.build(
            Arrays.asList(4, 2, 7, 1, 3, null, null, null, null, null, null));

        final InsertIntoABinarySearchTree solution = new InsertIntoABinarySearchTree();
        final TreeNode output = solution.insertIntoBST(head, 5);

        Assert.assertEquals(4, output.val);
        Assert.assertEquals(2, output.left.val);
        Assert.assertEquals(7, output.right.val);
        Assert.assertEquals(1, output.left.left.val);
        Assert.assertEquals(3, output.left.right.val);
        Assert.assertEquals(5, output.right.left.val);
    }

}
