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

        final int[][] output = new Sudoku().solveSimple(board);

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

    @Test
    public void test2() {
        final int[][] board = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 2, 8, 0},
            {3, 7, 6, 4, 0, 0, 0, 0, 0},
            {7, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 2, 0, 0, 0, 0, 0, 0, 0},
            {4, 0, 0, 3, 0, 0, 0, 0, 6},
            {0, 1, 0, 0, 2, 8, 0, 0, 0},
            {0, 0, 0, 0, 0, 5, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 3}
        };

        final int[][] output = new Sudoku().solveHard(board);

        final int[][] answer = {
            {8, 4, 2, 5, 1, 9, 3, 6, 7},
            {1, 5, 9, 6, 7, 3, 2, 8, 4},
            {3, 7, 6, 4, 8, 2, 9, 5, 1},
            {7, 3, 5, 2, 6, 1, 4, 9, 8},
            {6, 2, 1, 8, 9, 4, 7, 3, 5},
            {4, 9, 8, 3, 5, 7, 1, 2, 6},
            {5, 1, 3, 7, 2, 8, 6, 4, 9},
            {9, 6, 4, 1, 3, 5, 8, 7, 2},
            {2, 8, 7, 9, 4, 6, 5, 1, 3}
        };

        Assert.assertArrayEquals(answer, output);
    }

    @Test
    public void test3() {
        final int[] xy = new Sudoku().xy(4, 8);

        Assert.assertEquals(5, xy[0]);
        Assert.assertEquals(1, xy[1]);
        Assert.assertEquals(2, xy[2]);
    }

    @Test
    public void test4() {
        final int[] xy = new Sudoku().xy(8, 8);

        Assert.assertEquals(8, xy[0]);
        Assert.assertEquals(2, xy[1]);
        Assert.assertEquals(2, xy[2]);
    }

    @Test
    public void test5() {
        final int[] input = {8, 2, 2};
        final int[] output = new Sudoku().rxy(input);

        Assert.assertEquals(8, output[0]);
        Assert.assertEquals(8, output[1]);
    }

    @Test
    public void test6() {
        final int[] input = {5, 1, 2};
        final int[] output = new Sudoku().rxy(input);

        Assert.assertEquals(4, output[0]);
        Assert.assertEquals(8, output[1]);
    }

    @Test
    public void test7() {
        final int[][] board = {
            {6, 8, 0, 0, 0, 0, 2, 3, 0},
            {9, 0, 0, 0, 0, 4, 0, 0, 5},
            {2, 0, 7, 0, 0, 8, 0, 0, 0},
            {0, 6, 0, 0, 0, 0, 0, 5, 8},
            {0, 0, 2, 5, 0, 0, 1, 4, 0},
            {0, 9, 0, 0, 0, 0, 0, 2, 0},
            {1, 0, 4, 8, 7, 0, 9, 0, 0},
            {0, 0, 0, 0, 2, 0, 4, 0, 0},
            {0, 2, 6, 0, 0, 3, 5, 0, 7}
        };

        final int[][] output = new Sudoku().solveSimple(board);

        final int[][] answer = {
            {6, 8, 5, 7, 1, 9, 2, 3, 4},
            {9, 1, 3, 2, 6, 4, 8, 7, 5},
            {2, 4, 7, 3, 5, 8, 6, 9, 1},
            {4, 6, 1, 9, 3, 2, 7, 5, 8},
            {3, 7, 2, 5, 8, 6, 1, 4, 9},
            {5, 9, 8, 1, 4, 7, 3, 2, 6},
            {1, 3, 4, 8, 7, 5, 9, 6, 2},
            {7, 5, 9, 6, 2, 1, 4, 8, 3},
            {8, 2, 6, 4, 9, 3, 5, 1, 7}
        };

        Assert.assertArrayEquals(answer, output);
    }


}
