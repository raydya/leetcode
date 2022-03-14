package com.raydya;

import java.util.Arrays;

public class GameOfLife {

    public void gameOfLife(int[][] board) {
        final int[][] copy = Arrays.stream(board)
            .map(int[]::clone)
            .toArray(int[][]::new);

        final int m = copy.length;
        final int n = copy[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                final int cnt = countSurroundingAlive(copy, i, j);

                if ((cnt < 2 || cnt > 3) && copy[i][j] == 1) {
                    board[i][j] = 0;
                } else if (cnt == 3 && copy[i][j] == 0) {
                    board[i][j] = 1;
                } else if (copy[i][j] == 1) {
                    board[i][j] = 1;
                }
            }
        }
    }

    public int countSurroundingAlive(int[][] board, int m, int n) {
        final int k = board.length;
        final int h = board[0].length;
        int cnt = 0;

        for (int i = m - 1; i <= m + 1; i++) {
            if (i < 0 || i >= k) {
                continue;
            }
            for (int j = n - 1; j <= n + 1; j++) {
                if (j < 0 || j >= h) {
                    continue;
                }
                if (i == m && j == n) {
                    continue;
                }
                cnt += board[i][j];
            }
        }

        return cnt;
    }
}
