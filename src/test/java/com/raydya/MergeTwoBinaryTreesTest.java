package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class MergeTwoBinaryTreesTest {

    @Test
    public void test1() {
        final MergeTwoBinaryTrees solution = new MergeTwoBinaryTrees();
        final TreeNode output = solution.mergeTrees(TreeNodeUtil.build(Arrays.asList(1, 3, 2, 5)),
            TreeNodeUtil.build(Arrays.asList(2, 1, 3, null, 4, null, 7)));

        Assert.assertEquals(3, output.val);
        Assert.assertEquals(4, output.left.val);
        Assert.assertEquals(5, output.right.val);
        Assert.assertEquals(5, output.left.left.val);
        Assert.assertEquals(4, output.left.right.val);
        Assert.assertEquals(7, output.right.right.val);
        Assert.assertNull(output.right.left);
    }

    @Test
    public void test2() {
        final MergeTwoBinaryTrees solution = new MergeTwoBinaryTrees();
        final TreeNode output = solution.mergeTrees(TreeNodeUtil.build(Collections.singletonList(1)),
            TreeNodeUtil.build(Arrays.asList(1, 2)));

        Assert.assertEquals(2, output.val);
        Assert.assertEquals(2, output.left.val);
        Assert.assertNull(output.right);
    }
}
