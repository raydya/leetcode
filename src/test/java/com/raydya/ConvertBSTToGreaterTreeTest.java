package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class ConvertBSTToGreaterTreeTest {

    @Test
    public void test1() {
        final TreeNode root = TreeNodeUtil.build(
            Arrays.asList(4, 1, 6, 0, 2, 5, 7, null, null, null, 3, null, null, null, 8));

        final ConvertBSTToGreaterTree solution = new ConvertBSTToGreaterTree();
        final TreeNode output = solution.convertBST(root);

        Assert.assertEquals(30, output.val);
        Assert.assertEquals(36, output.left.val);
        Assert.assertEquals(21, output.right.val);
        Assert.assertEquals(36, output.left.left.val);
        Assert.assertEquals(35, output.left.right.val);
        Assert.assertEquals(26, output.right.left.val);
        Assert.assertEquals(15, output.right.right.val);
        Assert.assertNull(output.left.left.left);
        Assert.assertNull(output.left.left.right);
        Assert.assertNull(output.left.right.left);
        Assert.assertEquals(33, output.left.right.right.val);
        Assert.assertNull(output.right.left.left);
        Assert.assertNull(output.right.left.right);
        Assert.assertNull(output.right.right.left);
        Assert.assertEquals(8, output.right.right.right.val);
    }

    @Test
    public void test2() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(0, null, 1));

        final ConvertBSTToGreaterTree solution = new ConvertBSTToGreaterTree();
        final TreeNode output = solution.convertBST(root);

        Assert.assertEquals(1, output.val);
        Assert.assertNull(output.left);
        Assert.assertEquals(1, output.right.val);
    }

    @Test
    public void test3() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(1, 0, 2));

        final ConvertBSTToGreaterTree solution = new ConvertBSTToGreaterTree();
        final TreeNode output = solution.convertBST(root);

        Assert.assertEquals(3, output.val);
        Assert.assertEquals(3, output.left.val);
        Assert.assertEquals(2, output.right.val);
    }

    @Test
    public void test4() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(3, 2, 4, 1));

        final ConvertBSTToGreaterTree solution = new ConvertBSTToGreaterTree();
        final TreeNode output = solution.convertBST(root);

        Assert.assertEquals(7, output.val);
        Assert.assertEquals(9, output.left.val);
        Assert.assertEquals(4, output.right.val);
        Assert.assertEquals(10, output.left.left.val);
    }
}
