package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SearchA2DMatrixIITest {

    @Test
    public void test1() {
        final int[][] matrix = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };

        final SearchA2DMatrixII solution = new SearchA2DMatrixII();
        final boolean output = solution.searchMatrix(matrix, 5);

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final int[][] matrix = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };

        final SearchA2DMatrixII solution = new SearchA2DMatrixII();
        final boolean output = solution.searchMatrix(matrix, 20);

        Assert.assertFalse(output);
    }
}
