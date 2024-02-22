package com.raydya;

import com.raydya.data.type.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class ConstructBinaryTreeFromPreorderAndPostorderTraversalTest {

    @Test
    public void test1() {
        final ConstructBinaryTreeFromPreorderAndPostorderTraversal solution = new ConstructBinaryTreeFromPreorderAndPostorderTraversal();
        final TreeNode root = solution.constructFromPrePost(new int[]{1, 2, 4, 5, 3, 6, 7},
            new int[]{4, 5, 2, 6, 7, 3, 1});

        Assert.assertEquals(1, root.val);
        Assert.assertEquals(2, root.left.val);
        Assert.assertEquals(3, root.right.val);
        Assert.assertEquals(4, root.left.left.val);
        Assert.assertEquals(5, root.left.right.val);
        Assert.assertEquals(6, root.right.left.val);
        Assert.assertEquals(7, root.right.right.val);
    }

    @Test
    public void test2() {
        final ConstructBinaryTreeFromPreorderAndPostorderTraversal solution = new ConstructBinaryTreeFromPreorderAndPostorderTraversal();
        final TreeNode root = solution.constructFromPrePost(new int[]{1}, new int[]{1});

        Assert.assertEquals(1, root.val);
    }

}
