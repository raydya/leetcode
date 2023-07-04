package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SumInAMatrixTest {

    @Test
    public void test1() {
        final SumInAMatrix solution = new SumInAMatrix();
        final int output = solution.matrixSum(new int[][]{
            {7, 2, 1},
            {6, 4, 2},
            {6, 5, 3},
            {3, 2, 1}
        });

        Assert.assertEquals(15, output);
    }

    @Test
    public void test2() {
        final SumInAMatrix solution = new SumInAMatrix();
        final int output = solution.matrixSum(new int[][]{
            {1}
        });

        Assert.assertEquals(1, output);
    }

    @Test
    public void test3() {
        final SumInAMatrix solution = new SumInAMatrix();
        final int output = solution.matrixSum(new int[][]{
            {1, 8, 16, 15, 12, 9, 15, 11, 18, 6, 16, 4, 9, 4},
            {3, 19, 8, 17, 19, 4, 9, 3, 2, 10, 15, 17, 3, 11},
            {13, 10, 19, 20, 6, 17, 15, 14, 16, 8, 1, 17, 0, 2},
            {12, 20, 0, 19, 15, 10, 7, 10, 2, 6, 18, 7, 7, 4},
            {17, 14, 2, 2, 10, 16, 15, 3, 9, 17, 9, 3, 17, 10},
            {17, 6, 19, 17, 18, 9, 14, 2, 19, 12, 10, 18, 7, 9},
            {5, 6, 5, 1, 19, 8, 15, 2, 2, 4, 4, 1, 2, 17},
            {12, 16, 8, 16, 7, 6, 18, 13, 18, 8, 14, 15, 20, 11},
            {2, 10, 19, 3, 15, 18, 20, 10, 6, 7, 0, 8, 3, 7},
            {11, 5, 10, 13, 1, 3, 4, 7, 1, 18, 20, 17, 19, 2},
            {0, 3, 20, 6, 19, 18, 3, 12, 2, 11, 3, 1, 19, 0},
            {6, 5, 3, 15, 6, 1, 0, 17, 13, 19, 3, 8, 2, 7},
            {2, 20, 9, 11, 13, 5, 1, 16, 14, 1, 19, 3, 12, 6}
        });

        Assert.assertEquals(190, output);
    }

    @Test
    public void test4() {
        final SumInAMatrix solution = new SumInAMatrix();
        final int output = solution.matrixSum(new int[][]{
            {15, 18, 5, 6, 1, 5, 5, 10, 16, 8, 3, 19},
            {14, 5, 0, 15, 13, 18, 16, 9, 20, 11, 12, 8},
            {4, 17, 0, 14, 2, 10, 1, 17, 8, 4, 7, 15},
            {11, 19, 9, 11, 18, 20, 19, 4, 9, 12, 13, 20},
            {2, 0, 19, 6, 10, 5, 7, 7, 20, 14, 12, 18},
            {13, 1, 12, 18, 13, 1, 5, 14, 2, 8, 5, 14},
            {16, 15, 17, 19, 0, 1, 15, 10, 9, 14, 1, 13},
            {6, 17, 20, 2, 4, 0, 12, 13, 10, 0, 6, 0},
            {0, 16, 19, 3, 6, 3, 19, 20, 6, 9, 8, 5}
        });

        Assert.assertEquals(167, output);
    }
}
