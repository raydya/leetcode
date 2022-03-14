package com.raydya;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class SpiralMatrixTest {

    @Test
    public void test1() {
        final int[][] matrix = {
            new int[]{1, 2, 3},
            new int[]{4, 5, 6},
            new int[]{7, 8, 9}
        };

        final SpiralMatrix solution = new SpiralMatrix();
        final List<Integer> matrixInSpiralOrder = solution.spiralOrder(matrix);

        Assert.assertArrayEquals(
            new Integer[]{1, 2, 3, 6, 9, 8, 7, 4, 5},
            matrixInSpiralOrder.toArray()
        );
    }

    @Test
    public void test2() {
        final int[][] matrix = {
            new int[]{1, 2, 3, 4},
            new int[]{5, 6, 7, 8},
            new int[]{9, 10, 11, 12}
        };

        final SpiralMatrix solution = new SpiralMatrix();
        final List<Integer> matrixInSpiralOrder = solution.spiralOrder(matrix);

        Assert.assertArrayEquals(
            new Integer[]{1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7},
            matrixInSpiralOrder.toArray()
        );
    }

    @Test
    public void test3() {
        final int[][] matrix = {
            new int[]{1, 2, 3, 4},
            new int[]{5, 6, 7, 8},
            new int[]{9, 10, 11, 12},
            new int[]{13, 14, 15, 16},
        };

        final SpiralMatrix solution = new SpiralMatrix();
        final List<Integer> matrixInSpiralOrder = solution.spiralOrder(matrix);

        Assert.assertArrayEquals(
            new Integer[]{1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10},
            matrixInSpiralOrder.toArray()
        );
    }
}
