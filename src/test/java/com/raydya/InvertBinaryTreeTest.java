package com.raydya;

import com.raydya.data.type.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class InvertBinaryTreeTest {
    @Test
    public void test1() {
        final TreeNode n5 = new TreeNode(6);
        final TreeNode n6 = new TreeNode(9);

        final TreeNode n3 = new TreeNode(1);
        final TreeNode n4 = new TreeNode(3);

        final TreeNode n1 = new TreeNode(2, n3, n4);
        final TreeNode n2 = new TreeNode(7, n5, n6);

        final TreeNode root = new TreeNode(4, n1, n2);

        final InvertBinaryTree solution = new InvertBinaryTree();
        final TreeNode inverted = solution.invertTree(root);

        Assert.assertEquals(4, root.val);
        Assert.assertEquals(7, root.left.val);
        Assert.assertEquals(2, root.right.val);
        Assert.assertEquals(9, root.left.left.val);
        Assert.assertEquals(6, root.left.right.val);
        Assert.assertEquals(3, root.right.left.val);
        Assert.assertEquals(1, root.right.right.val);
    }
}
