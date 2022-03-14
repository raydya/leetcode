package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class PathSumIIITest {

    @Test
    public void test1() {
        final TreeNode root = TreeNodeUtil.build(
            Arrays.asList(10, 5, -3, 3, 2, null, 11, 3, -2, null, 1));

        final PathSumIII solution = new PathSumIII();
        final int output = solution.pathSum(root, 8);

        Assert.assertEquals(3, output);
    }

    @Test
    public void test2() {
        final TreeNode root = TreeNodeUtil.build(
            Arrays.asList(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1));

        final PathSumIII solution = new PathSumIII();
        final int output = solution.pathSum(root, 22);

        Assert.assertEquals(3, output);
    }

    @Test
    public void test3() {
        final TreeNode root = TreeNodeUtil.build(Arrays.asList(-2, null, -3));

        final PathSumIII solution = new PathSumIII();
        final int output = solution.pathSum(root, -5);

        Assert.assertEquals(1, output);
    }
}
