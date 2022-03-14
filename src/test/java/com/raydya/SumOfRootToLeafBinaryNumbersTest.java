package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import java.util.Arrays;
import java.util.Collections;
import org.junit.Assert;
import org.junit.Test;

public class SumOfRootToLeafBinaryNumbersTest {

    @Test
    public void test1() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(1, 0, 1, 0, 1, 0, 1));

        final SumOfRootToLeafBinaryNumbers solution = new SumOfRootToLeafBinaryNumbers();
        final int output = solution.sumRootToLeaf(root);

        Assert.assertEquals(22, output);
    }

    @Test
    public void test2() {
        final TreeNode root = TreeNodeUtil.build(Collections.singletonList(0));

        final SumOfRootToLeafBinaryNumbers solution = new SumOfRootToLeafBinaryNumbers();
        final int output = solution.sumRootToLeaf(root);

        Assert.assertEquals(0, output);
    }

    @Test
    public void test3() {
        final TreeNode root = TreeNodeUtil.build(Collections.singletonList(1));

        final SumOfRootToLeafBinaryNumbers solution = new SumOfRootToLeafBinaryNumbers();
        final int output = solution.sumRootToLeaf(root);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test4() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(1, 1));

        final SumOfRootToLeafBinaryNumbers solution = new SumOfRootToLeafBinaryNumbers();
        final int output = solution.sumRootToLeaf(root);

        Assert.assertEquals(3, output);
    }
}
