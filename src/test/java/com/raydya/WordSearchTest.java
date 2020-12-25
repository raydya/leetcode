package com.raydya;

import org.junit.Assert;
import org.junit.Test;

public class WordSearchTest {
    @Test
    public void test1() {
        final char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        final WordSearch solution = new WordSearch();
        final boolean exist = solution.exist(board, "ABCCED");

        Assert.assertTrue(exist);
    }

    @Test
    public void test2() {
        final char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        final WordSearch solution = new WordSearch();
        final boolean exist = solution.exist(board, "SEE");

        Assert.assertTrue(exist);
    }

    @Test
    public void test3() {
        final char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        final WordSearch solution = new WordSearch();
        final boolean exist = solution.exist(board, "ABCB");

        Assert.assertFalse(exist);
    }

    @Test
    public void test4() {
        final char[][] board = {{'a', 'a', 'a', 'a'}, {'a', 'a', 'a', 'a'}, {'a', 'a', 'a', 'a'}};
        final WordSearch solution = new WordSearch();
        final boolean exist = solution.exist(board, "aaaaaaaaaaaaa");

        Assert.assertFalse(exist);
    }

    @Test
    public void test5() {
        final char[][] board = new char[][]{{'a', 'a', 'a'}, {'a', 'b', 'b'}, {'a', 'b', 'b'}, {'b', 'b', 'b'}, {'b', 'b', 'b'}, {'a', 'a', 'a'}, {'b', 'b', 'b'}, {'a', 'b', 'b'}, {'a', 'a', 'b'}, {'a', 'b', 'a'}};
        final WordSearch solution = new WordSearch();
        final boolean exist = solution.exist(board, "aabaaaabbb");

        Assert.assertFalse(exist);
    }

    @Test
    public void test6() {
        final char[][] board = {{'a', 'b'}, {'c', 'd'}};
        final WordSearch solution = new WordSearch();
        final boolean exist = solution.exist(board, "acdb");

        Assert.assertTrue(exist);
    }

    @Test
    public void test7() {
        final char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'E', 'S'}, {'A', 'D', 'E', 'E'}};
        final WordSearch solution = new WordSearch();
        final boolean exist = solution.exist(board, "ABCESEEEFS");

        Assert.assertTrue(exist);
    }
}
