package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class TwoSumIVInputIsABSTTest {

    @Test
    public void test1() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(5, 3, 6, 2, 4, null, 7));

        final TwoSumIVInputIsABST solution = new TwoSumIVInputIsABST();
        final boolean output = solution.findTarget(root, 9);

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(5, 3, 6, 2, 4, null, 7));

        final TwoSumIVInputIsABST solution = new TwoSumIVInputIsABST();
        final boolean output = solution.findTarget(root, 28);

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(2, 1, 3));

        final TwoSumIVInputIsABST solution = new TwoSumIVInputIsABST();
        final boolean output = solution.findTarget(root, 4);

        Assert.assertTrue(output);
    }
}
