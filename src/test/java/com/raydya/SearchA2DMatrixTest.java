package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SearchA2DMatrixTest {
    @Test
    public void test1() {
        final SearchA2DMatrix solution = new SearchA2DMatrix();
        final boolean output = solution.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, 3);

        Assert.assertTrue(output);
    }

    @Test
    public void test2() {
        final SearchA2DMatrix solution = new SearchA2DMatrix();
        final boolean output = solution.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, 13);

        Assert.assertFalse(output);
    }

    @Test
    public void test3() {
        final SearchA2DMatrix solution = new SearchA2DMatrix();
        final boolean output = solution.searchMatrix(new int[][]{}, 0);

        Assert.assertFalse(output);
    }

    @Test
    public void test4() {
        final SearchA2DMatrix solution = new SearchA2DMatrix();
        final boolean output = solution.searchMatrix(new int[][]{{1}}, 1);

        Assert.assertTrue(output);
    }

    @Test
    public void test5() {
        final SearchA2DMatrix solution = new SearchA2DMatrix();
        final boolean output = solution.searchMatrix(new int[][]{{}}, 1);

        Assert.assertFalse(output);
    }
}
