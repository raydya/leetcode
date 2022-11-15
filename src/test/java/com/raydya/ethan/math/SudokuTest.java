package com.raydya.ethan.math;

import org.junit.Assert;
import org.junit.Test;

public class SudokuTest {

    @Test
    public void test1() {
        final int[][] board = {
            {5, 0, 3, 0, 0, 0, 6, 0, 0},
            {0, 0, 0, 0, 0, 7, 0, 0, 2},
            {0, 0, 0, 2, 5, 8, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 4, 1, 8},
            {0, 3, 6, 4, 8, 1, 2, 9, 0},
            {1, 4, 8, 5, 0, 9, 7, 0, 0},
            {0, 6, 2, 0, 7, 3, 0, 5, 9},
            {8, 9, 7, 1, 4, 0, 3, 0, 6},
            {0, 1, 5, 6, 9, 2, 0, 7, 4}
        };

        final int[][] output = new Sudoku().solve(board);

        final int[][] answer = {
            {5, 2, 3, 9, 1, 4, 6, 8, 7},
            {9, 8, 1, 3, 6, 7, 5, 4, 2},
            {6, 7, 4, 2, 5, 8, 9, 3, 1},
            {2, 5, 9, 7, 3, 6, 4, 1, 8},
            {7, 3, 6, 4, 8, 1, 2, 9, 5},
            {1, 4, 8, 5, 2, 9, 7, 6, 3},
            {4, 6, 2, 8, 7, 3, 1, 5, 9},
            {8, 9, 7, 1, 4, 5, 3, 2, 6},
            {3, 1, 5, 6, 9, 2, 8, 7, 4}
        };

        Assert.assertArrayEquals(answer, output);
    }

}
