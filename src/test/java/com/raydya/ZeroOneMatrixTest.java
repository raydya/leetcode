package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ZeroOneMatrixTest {

    @Test
    public void test1() {
        int[][] matrix = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};

        ZeroOneMatrix solution = new ZeroOneMatrix();
        int[][] output = solution.updateMatrix(matrix);

        Assert.assertArrayEquals(
            new int[][]{
                {0, 0, 0}, {0, 1, 0}, {0, 0, 0}
            },
            output
        );
    }

    @Test
    public void test2() {
        int[][] matrix = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};

        ZeroOneMatrix solution = new ZeroOneMatrix();
        int[][] output = solution.updateMatrix(matrix);

        Assert.assertArrayEquals(
            new int[][]{
                {0, 0, 0}, {0, 1, 0}, {1, 2, 1}
            },
            output
        );
    }

    @Test
    public void test3() {
        int[][] matrix = {{0, 1, 0}, {1, 1, 0}, {1, 1, 1}};

        ZeroOneMatrix solution = new ZeroOneMatrix();
        int[][] output = solution.updateMatrix(matrix);

        Assert.assertArrayEquals(
            new int[][]{
                {0, 1, 0}, {1, 1, 0}, {2, 2, 1}
            },
            output
        );
    }

    @Test
    public void test4() {
        int[][] matrix = {
            {1, 0, 1, 1, 0, 0, 1, 0, 0, 1}, {0, 1, 1, 0, 1, 0, 1, 0, 1, 1},
            {0, 0, 1, 0, 1, 0, 0, 1, 0, 0}, {1, 0, 1, 0, 1, 1, 1, 1, 1, 1},
            {0, 1, 0, 1, 1, 0, 0, 0, 0, 1}, {0, 0, 1, 0, 1, 1, 1, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 0, 0, 1, 1}, {1, 0, 0, 0, 1, 1, 1, 1, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 0, 1, 0}, {1, 1, 1, 1, 0, 1, 0, 0, 1, 1}
        };

        ZeroOneMatrix solution = new ZeroOneMatrix();
        int[][] output = solution.updateMatrix(matrix);

        Assert.assertArrayEquals(
            new int[][]{
                {1, 0, 1, 1, 0, 0, 1, 0, 0, 1}, {0, 1, 1, 0, 1, 0, 1, 0, 1, 1},
                {0, 0, 1, 0, 1, 0, 0, 1, 0, 0}, {1, 0, 1, 0, 1, 1, 1, 1, 1, 1},
                {0, 1, 0, 1, 1, 0, 0, 0, 0, 1}, {0, 0, 1, 0, 1, 1, 1, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 0, 0, 1, 1}, {1, 0, 0, 0, 1, 2, 1, 1, 0, 1},
                {2, 1, 1, 1, 1, 2, 1, 0, 1, 0}, {3, 2, 2, 1, 0, 1, 0, 0, 1, 1}
            },
            output
        );
    }
}
