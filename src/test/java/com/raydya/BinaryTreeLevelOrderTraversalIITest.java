package com.raydya;

import com.raydya.data.type.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinaryTreeLevelOrderTraversalIITest {

    @Test
    public void test1() {
        final TreeNode p7 = new TreeNode(7);
        final TreeNode p6 = new TreeNode(15);

        final TreeNode p3 = new TreeNode(20, p6, p7);
        final TreeNode p2 = new TreeNode(9, null, null);
        final TreeNode p1 = new TreeNode(3, p2, p3);

        final BinaryTreeLevelOrderTraversalII solution = new BinaryTreeLevelOrderTraversalII();
        final List<List<Integer>> levelOrderBottom = solution.levelOrderBottom(p1);

        Assert.assertArrayEquals(Arrays.asList(15, 7).toArray(), levelOrderBottom.get(0).toArray());
        Assert.assertArrayEquals(Arrays.asList(9, 20).toArray(), levelOrderBottom.get(1).toArray());
        Assert.assertArrayEquals(Collections.singletonList(3).toArray(), levelOrderBottom.get(2).toArray());
    }
}
