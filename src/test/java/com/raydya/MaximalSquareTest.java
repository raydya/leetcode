package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class MaximalSquareTest {

    @Test
    public void test1() {
        final char[][] matrix = {
            {'1', '0', '1', '0', '0'},
            {'1', '0', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '0', '0', '1', '0'},
        };
        final MaximalSquare solution = new MaximalSquare();
        final int output = solution.maximalSquare(matrix);

        Assert.assertEquals(4, output);
    }

    @Test
    public void test2() {
        final char[][] matrix = {
            {'0', '1'},
            {'1', '0'}
        };
        final MaximalSquare solution = new MaximalSquare();
        final int output = solution.maximalSquare(matrix);

        Assert.assertEquals(1, output);
    }

    @Test
    public void test3() {
        final char[][] matrix = {
            {'0'}
        };
        final MaximalSquare solution = new MaximalSquare();
        final int output = solution.maximalSquare(matrix);

        Assert.assertEquals(0, output);
    }

    @Test
    public void test4() {
        final char[][] matrix = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '1', '1', '0'},
            {'1', '1', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'0', '0', '1', '1', '1'},
        };
        final MaximalSquare solution = new MaximalSquare();
        final int output = solution.maximalSquare(matrix);

        Assert.assertEquals(16, output);
    }
}
