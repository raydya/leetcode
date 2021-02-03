package com.raydya;

import com.raydya.data.type.TreeNode;
import com.raydya.utils.TreeNodeUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PathSumIITest {
    @Test
    public void test1() {
        List<Integer> vals = Arrays.asList(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, null, 5, 1);
        final TreeNode root = TreeNodeUtil.build(vals);

        final PathSumII solution = new PathSumII();
        final List<List<Integer>> output = solution.pathSum(root, 22);

        Assert.assertArrayEquals(new Integer[]{5, 4, 11, 2}, output.get(0).toArray());
        Assert.assertArrayEquals(new Integer[]{5, 8, 4, 5}, output.get(1).toArray());
    }

    @Test
    public void test2() {
        final List<Integer> vals = Arrays.asList(1, 2, 3);
        final TreeNode root = TreeNodeUtil.build(vals);

        final PathSumII solution = new PathSumII();
        final List<List<Integer>> output = solution.pathSum(root, 5);

        Assert.assertEquals(0, output.size());
    }

    @Test
    public void test3() {
        final List<Integer> vals = Arrays.asList(1, 2);
        final TreeNode root = TreeNodeUtil.build(vals);

        final PathSumII solution = new PathSumII();
        final List<List<Integer>> output = solution.pathSum(root, 0);

        Assert.assertEquals(0, output.size());
    }
}
