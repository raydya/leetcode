package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SumRootToLeafNumbersTest {
    @Test
    public void test1() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(1, 2, 3));

        final SumRootToLeafNumbers solution = new SumRootToLeafNumbers();
        final int output = solution.sumNumbers(root);

        Assert.assertEquals(25, output);
    }

    @Test
    public void test2() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(4, 9, 0, 5, 1));

        final SumRootToLeafNumbers solution = new SumRootToLeafNumbers();
        final int output = solution.sumNumbers(root);

        Assert.assertEquals(1026, output);
    }
}
