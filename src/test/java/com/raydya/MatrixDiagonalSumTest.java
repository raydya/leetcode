package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MatrixDiagonalSumTest {
    @Test
    public void test1() {
        final MatrixDiagonalSum solution = new MatrixDiagonalSum();
        final int output = solution.diagonalSum(new int[][]{
            {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        });

        Assert.assertEquals(25, output);
    }

    @Test
    public void test2() {
        final MatrixDiagonalSum solution = new MatrixDiagonalSum();
        final int output = solution.diagonalSum(new int[][]{
            {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1},
        });

        Assert.assertEquals(8, output);
    }

    @Test
    public void test3() {
        final MatrixDiagonalSum solution = new MatrixDiagonalSum();
        final int output = solution.diagonalSum(new int[][]{
            {5}
        });

        Assert.assertEquals(5, output);
    }
}
