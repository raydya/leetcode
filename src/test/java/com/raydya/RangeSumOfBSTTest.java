package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RangeSumOfBSTTest {
    @Test
    public void test1() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(10, 5, 15, 3, 7, null, 18));

        final RangeSumOfBST solution = new RangeSumOfBST();
        final int output = solution.rangeSumBST(root, 7, 15);

        Assert.assertEquals(32, output);
    }

    @Test
    public void test2() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(10, 5, 15, 3, 7, 13, 18, 1, null, 6));

        final RangeSumOfBST solution = new RangeSumOfBST();
        final int output = solution.rangeSumBST(root, 6, 10);

        Assert.assertEquals(23, output);
    }
}
