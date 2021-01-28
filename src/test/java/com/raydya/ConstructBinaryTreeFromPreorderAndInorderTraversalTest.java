package com.raydya;

import com.raydya.data.type.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class ConstructBinaryTreeFromPreorderAndInorderTraversalTest {
    @Test
    public void test1() {
        final ConstructBinaryTreeFromPreorderAndInorderTraversal solution = new ConstructBinaryTreeFromPreorderAndInorderTraversal();
        final TreeNode root = solution.buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});

        Assert.assertEquals(3, root.val);
        Assert.assertEquals(9, root.left.val);
        Assert.assertEquals(20, root.right.val);
        Assert.assertEquals(15, root.right.left.val);
        Assert.assertEquals(7, root.right.right.val);
    }
}
