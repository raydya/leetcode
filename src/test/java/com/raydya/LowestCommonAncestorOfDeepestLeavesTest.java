package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class LowestCommonAncestorOfDeepestLeavesTest {

    @Test
    public void test1() {
        final LowestCommonAncestorOfDeepestLeaves solution = new LowestCommonAncestorOfDeepestLeaves();
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4));
        final TreeNode res = solution.lcaDeepestLeaves(root);

        Assert.assertEquals(2, res.val);
        Assert.assertEquals(7, res.left.val);
        Assert.assertEquals(4, res.right.val);
    }

    @Test
    public void test2() {
        final LowestCommonAncestorOfDeepestLeaves solution = new LowestCommonAncestorOfDeepestLeaves();
        final TreeNode root = TreeNodeUtil.build(Collections.singletonList(1));
        final TreeNode res = solution.lcaDeepestLeaves(root);

        Assert.assertEquals(1, res.val);
        Assert.assertNull(res.left);
        Assert.assertNull(res.right);
    }

    @Test
    public void test3() {
        final LowestCommonAncestorOfDeepestLeaves solution = new LowestCommonAncestorOfDeepestLeaves();
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(0, 1, 3, null, 2));
        final TreeNode res = solution.lcaDeepestLeaves(root);

        Assert.assertEquals(2, res.val);
        Assert.assertNull(res.left);
        Assert.assertNull(res.right);
    }

    @Test
    public void test4() {
        final LowestCommonAncestorOfDeepestLeaves solution = new LowestCommonAncestorOfDeepestLeaves();
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(1, 2, null, 3, 4, null, 6, null, 5));
        final TreeNode res = solution.lcaDeepestLeaves(root);

        Assert.assertEquals(5, res.val);
        Assert.assertNull(res.left);
        Assert.assertNull(res.right);
    }
}
