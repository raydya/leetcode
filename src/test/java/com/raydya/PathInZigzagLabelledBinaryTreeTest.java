package com.raydya;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PathInZigzagLabelledBinaryTreeTest {
    @Test
    public void test1() {
        final PathInZigzagLabelledBinaryTree solution = new PathInZigzagLabelledBinaryTree();
        final List<Integer> output = solution.pathInZigZagTree(14);

        Assert.assertArrayEquals(new Integer[]{1, 3, 4, 14}, output.toArray());
    }

    @Test
    public void test2() {
        final PathInZigzagLabelledBinaryTree solution = new PathInZigzagLabelledBinaryTree();
        final List<Integer> output = solution.pathInZigZagTree(26);

        Assert.assertArrayEquals(new Integer[]{1, 2, 6, 10, 26}, output.toArray());
    }
}
