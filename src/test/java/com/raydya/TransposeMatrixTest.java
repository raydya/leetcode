package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class TransposeMatrixTest {

    @Test
    public void test1() {
        final TransposeMatrix solution = new TransposeMatrix();
        final int[][] output = solution.transpose(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});

        Assert.assertArrayEquals(new int[][]{
            {1, 4, 7}, {2, 5, 8}, {3, 6, 9}
        }, output);
    }

    @Test
    public void test2() {
        final TransposeMatrix solution = new TransposeMatrix();
        final int[][] output = solution.transpose(new int[][]{{1, 2, 3}, {4, 5, 6}});

        Assert.assertArrayEquals(new int[][]{
            {1, 4}, {2, 5}, {3, 6}
        }, output);
    }
}
