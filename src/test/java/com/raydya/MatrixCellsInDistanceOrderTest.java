package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MatrixCellsInDistanceOrderTest {
    @Test
    public void test1() {
        final MatrixCellsInDistanceOrder solution = new MatrixCellsInDistanceOrder();
        final int[][] output = solution.allCellsDistOrder(1, 2, 0, 0);

        Assert.assertArrayEquals(new int[][]{{0, 0}, {0, 1}}, output);
    }

    @Test
    public void test2() {
        final MatrixCellsInDistanceOrder solution = new MatrixCellsInDistanceOrder();
        final int[][] output = solution.allCellsDistOrder(2, 2, 0, 1);

        Assert.assertArrayEquals(new int[][]{{0, 1}, {0, 0}, {1, 1}, {1, 0}}, output);
    }

    @Test
    public void test3() {
        final MatrixCellsInDistanceOrder solution = new MatrixCellsInDistanceOrder();
        final int[][] output = solution.allCellsDistOrder(2, 3, 1, 2);

        Assert.assertArrayEquals(new int[][]{{1, 2}, {1, 1}, {0, 2}, {1, 0}, {0, 1}, {0, 0}}, output);
    }
}
