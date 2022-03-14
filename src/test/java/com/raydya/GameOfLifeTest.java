package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class GameOfLifeTest {

    @Test
    public void testCount1() {
        final int[][] board = {{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};

        final GameOfLife solution = new GameOfLife();
        final int output = solution.countSurroundingAlive(board, 1, 2);

        Assert.assertEquals(3, output);
    }

    @Test
    public void testCount2() {
        final int[][] board = {{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};

        final GameOfLife solution = new GameOfLife();
        final int output = solution.countSurroundingAlive(board, 1, 0);

        Assert.assertEquals(3, output);
    }

    @Test
    public void test1() {
        final int[][] board = {{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};

        final GameOfLife solution = new GameOfLife();
        solution.gameOfLife(board);

        Assert.assertArrayEquals(
            new int[]{0, 0, 0}, board[0]
        );

        Assert.assertArrayEquals(
            new int[]{1, 0, 1}, board[1]
        );

        Assert.assertArrayEquals(
            new int[]{0, 1, 1}, board[2]
        );

        Assert.assertArrayEquals(
            new int[]{0, 1, 0}, board[3]
        );
    }

    @Test
    public void test2() {
        final int[][] board = {{1, 1}, {1, 0}};

        final GameOfLife solution = new GameOfLife();
        solution.gameOfLife(board);

        Assert.assertArrayEquals(
            new int[]{1, 1}, board[0]
        );

        Assert.assertArrayEquals(
            new int[]{1, 1}, board[1]
        );
    }
}
