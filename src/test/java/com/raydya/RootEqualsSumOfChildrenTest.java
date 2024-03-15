package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RootEqualsSumOfChildrenTest {

    @Test
    public void test1() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(10, 4, 6));

        final RootEqualsSumOfChildren solution = new RootEqualsSumOfChildren();
        final boolean output = solution.checkTree(root);

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(5, 3, 1));

        final RootEqualsSumOfChildren solution = new RootEqualsSumOfChildren();
        final boolean output = solution.checkTree(root);

        Assert.assertFalse(output);
    }
}
