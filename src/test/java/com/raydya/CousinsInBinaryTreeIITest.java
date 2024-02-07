package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class CousinsInBinaryTreeIITest {

    @Test
    public void test1() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(5, 4, 9, 1, 10, null, 7));

        final CousinsInBinaryTreeII solution = new CousinsInBinaryTreeII();
        final TreeNode output = solution.replaceValueInTree(root);

        Assert.assertEquals(0, output.val);
        Assert.assertEquals(0, output.left.val);
        Assert.assertEquals(0, output.right.val);
        Assert.assertEquals(7, output.left.left.val);
        Assert.assertEquals(7, output.left.right.val);
        Assert.assertNull(output.right.left);
        Assert.assertEquals(11, output.right.right.val);
    }

    @Test
    public void test2() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(3, 1, 2));

        final CousinsInBinaryTreeII solution = new CousinsInBinaryTreeII();
        final TreeNode output = solution.replaceValueInTree(root);

        Assert.assertEquals(0, output.val);
        Assert.assertEquals(0, output.left.val);
        Assert.assertEquals(0, output.right.val);
    }
}
