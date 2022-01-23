package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class FindWinnerOnATicTacToeGameTest {
    @Test
    public void test1() {
        final FindWinnerOnATicTacToeGame solution = new FindWinnerOnATicTacToeGame();
        final String output = solution.tictactoe(new int[][]{{0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}});

        Assert.assertEquals("A", output);
    }

    @Test
    public void test2() {
        final FindWinnerOnATicTacToeGame solution = new FindWinnerOnATicTacToeGame();
        final String output = solution.tictactoe(new int[][]{{0, 0}, {1, 1}, {0, 1}, {0, 2}, {1, 0}, {2, 0}});

        Assert.assertEquals("B", output);
    }

    @Test
    public void test3() {
        final FindWinnerOnATicTacToeGame solution = new FindWinnerOnATicTacToeGame();
        final String output = solution.tictactoe(new int[][]{{0, 0}, {1, 1}, {2, 0}, {1, 0}, {1, 2}, {2, 1}, {0, 1}, {0, 2}, {2, 2}});

        Assert.assertEquals("Draw", output);
    }

    @Test
    public void test4() {
        final FindWinnerOnATicTacToeGame solution = new FindWinnerOnATicTacToeGame();
        final String output = solution.tictactoe(new int[][]{{0, 0}, {1, 1}});

        Assert.assertEquals("Pending", output);
    }

    @Test
    public void test5() {
        final FindWinnerOnATicTacToeGame solution = new FindWinnerOnATicTacToeGame();
        final String output = solution.tictactoe(new int[][]{{0, 2}, {0, 1}, {2, 1}});

        Assert.assertEquals("Pending", output);
    }
}
