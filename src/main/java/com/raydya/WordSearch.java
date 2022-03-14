package com.raydya;

import java.util.Arrays;

public class WordSearch {

    public boolean exist(char[][] board, String word) {
        final char[] chars = word.toCharArray();
        final int m = board.length;
        final int n = board[0].length;

        if (word.length() > m * n) {
            return false;
        }

        final boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (exists(board, chars, i, j, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean exists(char[][] board, char[] chars, int i, int j, boolean[][] visited) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || visited[i][j]
            || board[i][j] != chars[0]) {
            return false;
        }

        if (chars.length == 1) {
            return true;
        }

        final char[] newChars = Arrays.copyOfRange(chars, 1, chars.length);

        visited[i][j] = true;

        if (exists(board, newChars, i, j - 1, visited)
            || exists(board, newChars, i, j + 1, visited)
            || exists(board, newChars, i - 1, j, visited)
            || exists(board, newChars, i + 1, j, visited)) {
            return true;
        }

        visited[i][j] = false;

        return false;
    }
}
