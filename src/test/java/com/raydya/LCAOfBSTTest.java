package com.raydya;

import com.raydya.data.type.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class LCAOfBSTTest {

    @Test
    public void test1() {
        final TreeNode n8 = new TreeNode(9);
        final TreeNode n7 = new TreeNode(7);

        final TreeNode n6 = new TreeNode(5);
        final TreeNode n5 = new TreeNode(3);

        final TreeNode n4 = new TreeNode(4, n5, n6);
        final TreeNode n3 = new TreeNode(0);

        final TreeNode n2 = new TreeNode(8, n7, n8);
        final TreeNode n1 = new TreeNode(2, n3, n4);
        final TreeNode root = new TreeNode(6, n1, n2);

        final LCAOfBST solution = new LCAOfBST();
        final TreeNode node = solution.lowestCommonAncestor(root, n1, n2);

        Assert.assertEquals(root, node);
    }

    @Test
    public void test2() {
        final TreeNode n8 = new TreeNode(9);
        final TreeNode n7 = new TreeNode(7);

        final TreeNode n6 = new TreeNode(5);
        final TreeNode n5 = new TreeNode(3);

        final TreeNode n4 = new TreeNode(4, n5, n6);
        final TreeNode n3 = new TreeNode(0);

        final TreeNode n2 = new TreeNode(8, n7, n8);
        final TreeNode n1 = new TreeNode(2, n3, n4);
        final TreeNode root = new TreeNode(6, n1, n2);

        final LCAOfBST solution = new LCAOfBST();
        final TreeNode node = solution.lowestCommonAncestor(root, n1, n4);

        Assert.assertEquals(n1, node);
    }

    @Test
    public void test3() {
        final TreeNode n1 = new TreeNode(1);
        final TreeNode root = new TreeNode(2);
        root.left = n1;

        final LCAOfBST solution = new LCAOfBST();
        final TreeNode node = solution.lowestCommonAncestor(root, root, n1);

        Assert.assertEquals(root, node);
    }

    @Test
    public void test4() {
        final TreeNode n1 = new TreeNode(1);
        final TreeNode root = new TreeNode(2);
        root.left = n1;

        final LCAOfBST solution = new LCAOfBST();
        final TreeNode node = solution.lowestCommonAncestor(root, n1, root);

        Assert.assertEquals(root, node);
    }

    @Test
    public void test5() {
        final TreeNode n2 = new TreeNode(3);
        final TreeNode n1 = new TreeNode(1);
        final TreeNode root = new TreeNode(2, n1, n2);

        final LCAOfBST solution = new LCAOfBST();
        final TreeNode node = solution.lowestCommonAncestor(root, n2, n1);

        Assert.assertEquals(root, node);
    }

    @Test
    public void test6() {
        final TreeNode n3 = new TreeNode(2);

        final TreeNode n2 = new TreeNode(4);
        final TreeNode n1 = new TreeNode(1, null, n3);
        final TreeNode root = new TreeNode(3, n1, n2);

        final LCAOfBST solution = new LCAOfBST();
        final TreeNode node = solution.lowestCommonAncestor(root, n3, root);

        Assert.assertEquals(root, node);
    }
}
