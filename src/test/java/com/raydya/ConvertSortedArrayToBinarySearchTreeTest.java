package com.raydya;

import com.raydya.data.type.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class ConvertSortedArrayToBinarySearchTreeTest {

    @Test
    public void test1() {
        final int[] input = {-10, -3, 0, 5, 9};

        final ConvertSortedArrayToBinarySearchTree solution = new ConvertSortedArrayToBinarySearchTree();
        final TreeNode output = solution.sortedArrayToBST(input);

        Assert.assertEquals(0, output.val);
        Assert.assertEquals(-3, output.left.val);
        Assert.assertEquals(9, output.right.val);
        Assert.assertEquals(-10, output.left.left.val);
        Assert.assertNull(output.left.right);
        Assert.assertEquals(5, output.right.left.val);
        Assert.assertNull(output.right.right);
    }
}
