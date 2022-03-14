package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class SurroundedRegionsTest {

    @Test
    public void test1() {
        final char[][] board = {
            {'X', 'X', 'X', 'X'},
            {'X', 'O', 'O', 'X'},
            {'X', 'X', 'O', 'X'},
            {'X', 'O', 'X', 'X'}
        };

        final SurroundedRegions solution = new SurroundedRegions();
        solution.solve(board);

        Assert.assertArrayEquals(
            new char[][]{
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'}
            },
            board
        );
    }

    @Test
    public void test2() {
        final char[][] board = {
            {'X', 'X', 'X', 'X'},
            {'X', 'O', 'O', 'X'},
            {'X', 'O', 'O', 'X'},
            {'X', 'O', 'X', 'X'}
        };

        final SurroundedRegions solution = new SurroundedRegions();
        solution.solve(board);

        Assert.assertArrayEquals(
            new char[][]{
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
            },
            board
        );
    }
}
