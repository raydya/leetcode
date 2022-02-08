package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class TheKWeakestRowsInAMatrixTest {
    @Test
    public void test1() {
        final TheKWeakestRowsInAMatrix solution = new TheKWeakestRowsInAMatrix();
        final int[][] matrix = {{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}};
        final int[] output = solution.kWeakestRows(matrix, 3);

        Assert.assertArrayEquals(new int[]{2, 0, 3}, output);
    }

    @Test
    public void test2() {
        final TheKWeakestRowsInAMatrix solution = new TheKWeakestRowsInAMatrix();
        final int[][] matrix = {{1, 0, 0, 0}, {1, 1, 1, 1}, {1, 0, 0, 0}, {1, 0, 0, 0}};
        final int[] output = solution.kWeakestRows(matrix, 2);

        Assert.assertArrayEquals(new int[]{0, 2}, output);
    }
}
