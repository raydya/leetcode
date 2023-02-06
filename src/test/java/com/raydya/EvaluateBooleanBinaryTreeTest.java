package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class EvaluateBooleanBinaryTreeTest {

    @Test
    public void test1() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(2, 1, 3, null, null, 0, 1));

        final EvaluateBooleanBinaryTree solution = new EvaluateBooleanBinaryTree();
        final boolean output = solution.evaluateTree(root);

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final TreeNode root = TreeNodeUtil.build(Collections.singletonList(0));

        final EvaluateBooleanBinaryTree solution = new EvaluateBooleanBinaryTree();
        final boolean output = solution.evaluateTree(root);

        Assert.assertFalse(output);
    }

}
