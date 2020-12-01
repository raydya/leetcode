package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class ValidSudokuTest {
    @Test
    public void test1() {
        final char[][] board = {
            new char[]{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            new char[]{'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            new char[]{'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            new char[]{'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            new char[]{'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            new char[]{'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            new char[]{'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            new char[]{'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            new char[]{'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        final ValidSudoku solution = new ValidSudoku();
        final boolean validSudoku = solution.isValidSudoku(board);

        Assert.assertTrue(validSudoku);
    }

    @Test
    public void test2() {
        final char[][] board = {
            new char[]{'8', '3', '.', '.', '7', '.', '.', '.', '.'},
            new char[]{'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            new char[]{'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            new char[]{'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            new char[]{'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            new char[]{'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            new char[]{'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            new char[]{'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            new char[]{'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        final ValidSudoku solution = new ValidSudoku();
        final boolean validSudoku = solution.isValidSudoku(board);

        Assert.assertFalse(validSudoku);
    }

    @Test
    public void test3() {
        final char[][] board = {
            new char[]{'.', '.', '.', '.', '5', '.', '.', '1', '.'},
            new char[]{'.', '4', '.', '3', '.', '.', '.', '.', '.'},
            new char[]{'.', '.', '.', '.', '.', '3', '.', '.', '1'},
            new char[]{'8', '.', '.', '.', '.', '.', '.', '2', '.'},
            new char[]{'.', '.', '2', '.', '7', '.', '.', '.', '.'},
            new char[]{'.', '1', '5', '.', '.', '.', '.', '.', '.'},
            new char[]{'.', '.', '.', '.', '.', '2', '.', '.', '.'},
            new char[]{'.', '2', '.', '9', '.', '.', '.', '.', '.'},
            new char[]{'.', '.', '4', '.', '.', '.', '.', '.', '.'}
        };

        final ValidSudoku solution = new ValidSudoku();
        final boolean validSudoku = solution.isValidSudoku(board);

        Assert.assertFalse(validSudoku);
    }

    @Test
    public void test4() {
        final ValidSudoku solution = new ValidSudoku();
        final int[] position = solution.getPosition(3, 0);

        Assert.assertArrayEquals(new int[]{0, 3}, position);
    }
}
