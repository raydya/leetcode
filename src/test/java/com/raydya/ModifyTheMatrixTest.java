package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ModifyTheMatrixTest {

    @Test
    public void test1() {
        final ModifyTheMatrix solution = new ModifyTheMatrix();
        final int[][] output = solution.modifiedMatrix(new int[][]{
            {1, 2, -1},
            {4, -1, 6},
            {7, 8, 9}
        });

        Assert.assertArrayEquals(new int[][]{
            {1, 2, 9},
            {4, 8, 6},
            {7, 8, 9}
        }, output);
    }

    @Test
    public void test2() {
        final ModifyTheMatrix solution = new ModifyTheMatrix();
        final int[][] output = solution.modifiedMatrix(new int[][]{
            {3, -1},
            {5, 2}
        });

        Assert.assertArrayEquals(new int[][]{
            {3, 2},
            {5, 2}
        }, output);
    }
}
