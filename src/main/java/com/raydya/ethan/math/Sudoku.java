package com.raydya.ethan.math;

import java.util.Arrays;

public class Sudoku {

    private static final int N = 9;

    public int[][] solve(final int[][] board) {
        final int[] candidates = new int[N];
        Arrays.fill(candidates, N);

        for (final int[] r : board) {
            for (final int c : r) {
                if (c > 0) {
                    candidates[c - 1]--;
                }
            }
        }

        int i = 0;
        int j = 0;

        final boolean[] p = new boolean[N];
        Arrays.fill(p, true);

        while (!isFinished(candidates)) {

            final int x = board[i][j];
            if (x == 0) {
                // row
                for (final int r : board[i]) {
                    if (r > 0) {
                        p[r - 1] = false;
                    }
                }

                // column
                for (int k = 0; k < N; k++) {
                    final int v = board[k][j];
                    if (v > 0) {
                        p[v - 1] = false;
                    }
                }

                // nine block
                final int nx = (i / 3) * 3;
                final int ny = (j / 3) * 3;
                for (int m = nx; m < nx + 3; m++) {
                    for (int n = ny; n < ny + 3; n++) {
                        final int v = board[m][n];
                        if (v > 0) {
                            p[v - 1] = false;
                        }
                    }
                }

                final int bingo = bingo(p);
                if (bingo > 0) {
                    board[i][j] = bingo;
                    candidates[bingo - 1]--;
                }
            }

            i = (i + ((j + 1) / N)) % N;
            j = (j + 1) % N;
            Arrays.fill(p, true);
        }

        return board;
    }

    private int bingo(final boolean[] p) {
        int x = 0;
        for (int i = 0; i < p.length; i++) {
            if (p[i]) {
                if (x == 0) {
                    x = i + 1;
                } else {
                    return -1;
                }
            }
        }

        return x;
    }

    private boolean isFinished(final int[] candidates) {
        for (final int candidate : candidates) {
            if (candidate > 0) {
                return false;
            }
        }
        return true;
    }

}
