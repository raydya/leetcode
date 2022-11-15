package com.raydya.ethan.math;

import java.util.Arrays;

public class Sudoku {

    private static final int N = 9;
    private static final int S = 3;

    public int[][] solveSimple(final int[][] board) {
        final int[] candidates = new int[N];
        Arrays.fill(candidates, N);
        final boolean[][][] ngm = new boolean[N][N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                final int c = board[i][j];
                Arrays.fill(ngm[i][j], true);
                if (c > 0) {
                    for (int n = 0; n < N; n++) {
                        ngm[i][n][c - 1] = false;
                        ngm[n][j][c - 1] = false;
                    }
                }
            }
        }

        for (final int[] r : board) {
            for (final int c : r) {
                if (c > 0) {
                    candidates[c - 1]--;
                }
            }
        }

        int i = 0;
        int j = 0;

        while (!isFinished(candidates)) {

            final int x = board[i][j];
            if (x == 0) {
                // row
                for (int k = 0; k < N; k++) {
                    final int r = board[i][k];
                    if (r > 0) {
                        ngm[i][j][r - 1] = false;
                    }
                }

                // column
                for (int k = 0; k < N; k++) {
                    final int v = board[k][j];
                    if (v > 0) {
                        ngm[i][j][v - 1] = false;
                    }
                }

                // nine block
                final int nx = (i / 3) * 3;
                final int ny = (j / 3) * 3;
                for (int m = nx; m < nx + 3; m++) {
                    for (int n = ny; n < ny + 3; n++) {
                        final int v = board[m][n];
                        if (v > 0) {
                            ngm[i][j][v - 1] = false;
                        }
                    }
                }

                final int bingo = bingo(i, j, ngm);
                if (bingo > 0) {
                    board[i][j] = bingo;
                    candidates[bingo - 1]--;
                }
            }

            i = (i + ((j + 1) / N)) % N;
            j = (j + 1) % N;
        }

        return board;
    }

    private int bingo(final int x, final int y, final boolean[][][] ngm) {
        final boolean[] p = ngm[x][y];
        int t = 0;
        // 单格仅有一个可能
        for (int i = 0; i < N; i++) {
            if (p[i]) {
                if (t == 0) {
                    t = i + 1;
                } else {
                    t = 0;
                    break;
                }
            }
        }
        return t;
    }

    private boolean isFinished(final int[] candidates) {
        for (final int candidate : candidates) {
            if (candidate > 0) {
                return false;
            }
        }
        return true;
    }


    public int[][] solveHard(final int[][] board) {
        final int[][][] boxes = toNineBox(board);

        return board;
    }

    private int[][][] toNineBox(final int[][] board) {
        final int[][][] box = new int[N][S][S];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                final int[] xy = xy(i, j);
                final int b = xy[0];
                final int m = xy[1];
                final int n = xy[2];
                box[b][m][n] = board[i][j];
            }
        }

        return box;
    }

    public int[] xy(final int v, final int h) {
        int b = (v / 3 * 3) + h / 3;
        int bv = v % 3;
        int bh = h % 3;

        return new int[]{b, bv, bh};
    }

    public int[] rxy(int[] xy) {
        final int b = xy[0];
        final int mo = b / 3 * 3;
        final int no = b % 3 * 3;
        return new int[]{mo + xy[1], no + xy[2]};
    }

}
