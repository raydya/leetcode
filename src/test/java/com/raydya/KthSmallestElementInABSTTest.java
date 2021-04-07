package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class KthSmallestElementInABSTTest {
    @Test
    public void test1() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(3, 1, 4, null, 2));

        final KthSmallestElementInABST solution = new KthSmallestElementInABST();
        final int output = solution.kthSmallest(root, 1);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test2() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(5, 3, 6, 2, 4, null, null, 1));

        final KthSmallestElementInABST solution = new KthSmallestElementInABST();
        final int output = solution.kthSmallest(root, 3);

        Assert.assertEquals(3, output);
    }
}
