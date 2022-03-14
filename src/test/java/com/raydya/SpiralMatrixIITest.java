package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SpiralMatrixIITest {

    @Test
    public void test1() {
        final SpiralMatrixII solution = new SpiralMatrixII();
        final int[][] matrix = solution.generateMatrix(3);

        Assert.assertArrayEquals(
            new int[][]{
                {1, 2, 3}, {8, 9, 4}, {7, 6, 5}
            },
            matrix
        );
    }

    @Test
    public void test2() {
        final SpiralMatrixII solution = new SpiralMatrixII();
        final int[][] matrix = solution.generateMatrix(1);

        Assert.assertArrayEquals(new int[][]{{1}}, matrix);
    }
}
