package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class MergeTreesTest {

    @Test
    public void test1() {
        final TreeNode root1 = TreeNodeUtil.build(Arrays.asList(1, 3, 2, 5));
        final TreeNode root2 = TreeNodeUtil.build(Arrays.asList(2, 1, 3, null, 4, null, 7));

        final MergeTrees solution = new MergeTrees();
        final TreeNode output = solution.mergeTrees(root1, root2);

        Assert.assertEquals(3, output.val);
        Assert.assertEquals(4, output.left.val);
        Assert.assertEquals(5, output.right.val);
        Assert.assertEquals(5, output.left.left.val);
        Assert.assertEquals(4, output.left.right.val);
        Assert.assertNull(output.right.left);
        Assert.assertEquals(7, output.right.right.val);
    }

    @Test
    public void test2() {
        final MergeTrees solution = new MergeTrees();
        final TreeNode output = solution.mergeTrees(null, null);

        Assert.assertNull(output);
    }

    @Test
    public void test3() {
        final TreeNode root1 = TreeNodeUtil.build(Arrays.asList(3, 4, 5, 1, 2, null, null, 0));
        final TreeNode root2 = TreeNodeUtil.build(Arrays.asList(4, 1, 2));

        final MergeTrees solution = new MergeTrees();
        final TreeNode output = solution.mergeTrees(root1, root2);

        Assert.assertEquals(7, output.val);
        Assert.assertEquals(5, output.left.val);
        Assert.assertEquals(7, output.right.val);
        Assert.assertEquals(1, output.left.left.val);
        Assert.assertEquals(2, output.left.right.val);
        Assert.assertNull(output.right.left);
        Assert.assertNull(output.right.right);
        Assert.assertEquals(0, output.left.left.left.val);
    }
}
