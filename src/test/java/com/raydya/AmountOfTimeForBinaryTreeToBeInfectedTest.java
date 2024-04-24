package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class AmountOfTimeForBinaryTreeToBeInfectedTest {

    @Test
    public void test1() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(1, 5, 3, null, 4, 10, 6, null, null, 9, 2));

        final AmountOfTimeForBinaryTreeToBeInfected solution = new AmountOfTimeForBinaryTreeToBeInfected();
        final int output = solution.amountOfTime(root, 3);

        Assert.assertEquals(4, output);
    }

    @Test
    public void test2() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(1));

        final AmountOfTimeForBinaryTreeToBeInfected solution = new AmountOfTimeForBinaryTreeToBeInfected();
        final int output = solution.amountOfTime(root, 1);

        Assert.assertEquals(0, output);
    }
}
