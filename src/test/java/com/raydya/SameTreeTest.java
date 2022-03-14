package com.raydya;

import com.raydya.data.type.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class SameTreeTest {

    @Test
    public void test1() {
        final TreeNode p3 = new TreeNode(3);
        final TreeNode p2 = new TreeNode(2);
        final TreeNode p1 = new TreeNode(1, p2, p3);

        final TreeNode q3 = new TreeNode(3);
        final TreeNode q2 = new TreeNode(2);
        final TreeNode q1 = new TreeNode(1, q2, q3);

        final SameTree solution = new SameTree();
        final boolean isSameTree = solution.isSameTree(p1, q1);

        Assert.assertTrue(isSameTree);
    }

    @Test
    public void test2() {
        final TreeNode p2 = new TreeNode(2);
        final TreeNode p1 = new TreeNode(1, p2, null);

        final TreeNode q2 = new TreeNode(2);
        final TreeNode q1 = new TreeNode(1, null, q2);

        final SameTree solution = new SameTree();
        final boolean isSameTree = solution.isSameTree(p1, q1);

        Assert.assertFalse(isSameTree);
    }

    @Test
    public void test3() {
        final TreeNode p3 = new TreeNode(1);
        final TreeNode p2 = new TreeNode(2);
        final TreeNode p1 = new TreeNode(1, p2, p3);

        final TreeNode q3 = new TreeNode(2);
        final TreeNode q2 = new TreeNode(1);
        final TreeNode q1 = new TreeNode(1, q2, q3);

        final SameTree solution = new SameTree();
        final boolean isSameTree = solution.isSameTree(p1, q1);

        Assert.assertFalse(isSameTree);
    }
}
