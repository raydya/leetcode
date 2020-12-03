package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class RotateImageTest {
    @Test
    public void test1() {
        final int[][] matrix = {
            new int[]{1, 2, 3},
            new int[]{4, 5, 6},
            new int[]{7, 8, 9}
        };

        final RotateImage solution = new RotateImage();
        solution.rotate(matrix);

        Assert.assertArrayEquals(new int[]{7, 4, 1}, matrix[0]);
        Assert.assertArrayEquals(new int[]{8, 5, 2}, matrix[1]);
        Assert.assertArrayEquals(new int[]{9, 6, 3}, matrix[2]);
    }

    @Test
    public void test2() {
        final int[][] matrix = {
            new int[]{5, 1, 9, 11},
            new int[]{2, 4, 8, 10},
            new int[]{13, 3, 6, 7},
            new int[]{15, 14, 12, 16},
        };

        final RotateImage solution = new RotateImage();
        solution.rotate(matrix);

        Assert.assertArrayEquals(new int[]{15, 13, 2, 5}, matrix[0]);
        Assert.assertArrayEquals(new int[]{14, 3, 4, 1}, matrix[1]);
        Assert.assertArrayEquals(new int[]{12, 6, 8, 9}, matrix[2]);
        Assert.assertArrayEquals(new int[]{16, 7, 10, 11}, matrix[3]);
    }

    @Test
    public void test3() {
        final int[][] matrix = {
            new int[]{1},
        };

        final RotateImage solution = new RotateImage();
        solution.rotate(matrix);

        Assert.assertArrayEquals(new int[]{1}, matrix[0]);
    }

    @Test
    public void test4() {
        final int[][] matrix = {
            new int[]{1, 2},
            new int[]{3, 4},
        };

        final RotateImage solution = new RotateImage();
        solution.rotate(matrix);

        Assert.assertArrayEquals(new int[]{3, 1}, matrix[0]);
        Assert.assertArrayEquals(new int[]{4, 2}, matrix[1]);
    }
}
