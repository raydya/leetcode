package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class IncreasingOrderSearchTreeTest {

    @Test
    public void test1() {
        final TreeNode root = TreeNodeUtil.build(
            Arrays.asList(5, 3, 6, 2, 4, null, 8, 1, null, null, null, null, null, 7, 9));

        final IncreasingOrderSearchTree solution = new IncreasingOrderSearchTree();
        final TreeNode output = solution.increasingBST(root);

        Assert.assertEquals(1, output.val);
        Assert.assertEquals(2, output.right.val);
        Assert.assertEquals(3, output.right.right.val);
        Assert.assertEquals(4, output.right.right.right.val);
        Assert.assertEquals(5, output.right.right.right.right.val);
        Assert.assertEquals(6, output.right.right.right.right.right.val);
        Assert.assertEquals(7, output.right.right.right.right.right.right.val);
        Assert.assertEquals(8, output.right.right.right.right.right.right.right.val);
        Assert.assertEquals(9, output.right.right.right.right.right.right.right.right.val);
    }

    @Test
    public void test2() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(5, 1, 7));

        final IncreasingOrderSearchTree solution = new IncreasingOrderSearchTree();
        final TreeNode output = solution.increasingBST(root);

        Assert.assertEquals(1, output.val);
        Assert.assertEquals(5, output.right.val);
        Assert.assertEquals(7, output.right.right.val);
    }
}
