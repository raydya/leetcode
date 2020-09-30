package com.raydya;

import com.raydya.data.type.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class SymmetricTreeTest {

    @Test
    public void test1() {
        final TreeNode p7 = new TreeNode(3);
        final TreeNode p6 = new TreeNode(4);

        final TreeNode p5 = new TreeNode(4);
        final TreeNode p4 = new TreeNode(3);

        final TreeNode p3 = new TreeNode(2, p6, p7);
        final TreeNode p2 = new TreeNode(2, p4, p5);
        final TreeNode p1 = new TreeNode(1, p2, p3);

        final SymmetricTree solution = new SymmetricTree();
        final boolean isSymmetric = solution.isSymmetric(p1);

        Assert.assertTrue(isSymmetric);
    }

    @Test
    public void test2() {
        final TreeNode p7 = new TreeNode(3);

        final TreeNode p4 = new TreeNode(3);

        final TreeNode p3 = new TreeNode(2, null, p7);
        final TreeNode p2 = new TreeNode(2, null, p4);
        final TreeNode p1 = new TreeNode(1, p2, p3);

        final SymmetricTree solution = new SymmetricTree();
        final boolean isSymmetric = solution.isSymmetric(p1);

        Assert.assertFalse(isSymmetric);
    }

    @Test
    public void test3() {
        final SymmetricTree solution = new SymmetricTree();
        final boolean isSymmetric = solution.isSymmetric(null);

        Assert.assertTrue(isSymmetric);
    }
}
