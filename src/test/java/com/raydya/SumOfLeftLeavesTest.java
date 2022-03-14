package com.raydya;

import com.raydya.data.type.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class SumOfLeftLeavesTest {

    @Test
    public void test1() {
        final TreeNode n4 = new TreeNode(7);
        final TreeNode n3 = new TreeNode(15);

        final TreeNode n2 = new TreeNode(20, n3, n4);
        final TreeNode n1 = new TreeNode(9);
        final TreeNode root = new TreeNode(3, n1, n2);

        final SumOfLeftLeaves solution = new SumOfLeftLeaves();
        final int sumOfLeftLeaves = solution.sumOfLeftLeaves(root);

        Assert.assertEquals(24, sumOfLeftLeaves);
    }

    @Test
    public void test2() {
        final TreeNode n8 = new TreeNode(8);

        final TreeNode n7 = new TreeNode(1);
        final TreeNode n6 = new TreeNode(5);

        final TreeNode n5 = new TreeNode(-1, null, n8);
        final TreeNode n4 = new TreeNode(3, null, n7);

        final TreeNode n3 = new TreeNode(1, n6, n7);

        final TreeNode n2 = new TreeNode(4, n4, n5);
        final TreeNode n1 = new TreeNode(2, n3, null);
        final TreeNode root = new TreeNode(0, n1, n2);

        final SumOfLeftLeaves solution = new SumOfLeftLeaves();
        final int sumOfLeftLeaves = solution.sumOfLeftLeaves(root);

        Assert.assertEquals(5, sumOfLeftLeaves);
    }
}
