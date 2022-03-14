package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import java.util.Arrays;
import java.util.Collections;
import org.junit.Assert;
import org.junit.Test;

public class SubtreeOfAnotherTreeTest {

    @Test
    public void test1() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(3, 4, 5, 1, 2));
        final TreeNode subRoot = TreeNodeUtil.build(Arrays.asList(4, 1, 2));

        final SubtreeOfAnotherTree solution = new SubtreeOfAnotherTree();
        final boolean output = solution.isSubtree(root, subRoot);

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final TreeNode root = TreeNodeUtil.build(
            Arrays.asList(3, 4, 5, 1, 2, null, null, null, null, 0));
        final TreeNode subRoot = TreeNodeUtil.build(Arrays.asList(4, 1, 2));

        final SubtreeOfAnotherTree solution = new SubtreeOfAnotherTree();
        final boolean output = solution.isSubtree(root, subRoot);

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(1, 1));
        final TreeNode subRoot = TreeNodeUtil.build(Collections.singletonList(1));

        final SubtreeOfAnotherTree solution = new SubtreeOfAnotherTree();
        final boolean output = solution.isSubtree(root, subRoot);

        Assert.assertTrue(output);
    }

    @Test
    public void test4() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(3, 4, 5, 1, null, 2));
        final TreeNode subRoot = TreeNodeUtil.build(Arrays.asList(3, 1, 2));

        final SubtreeOfAnotherTree solution = new SubtreeOfAnotherTree();
        final boolean output = solution.isSubtree(root, subRoot);

        Assert.assertFalse(output);
    }
}
