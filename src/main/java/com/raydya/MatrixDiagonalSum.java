package com.raydya;

public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        final int l = mat.length;
        final boolean even = l % 2 == 0;

        int ret = 0;
        // primary diagonal
        for (int i = 0; i < l; i++) {
            ret += mat[i][i];
        }

        // secondary diagonal
        for (int i = l - 1; i >= 0; i--) {
            ret += mat[l - i - 1][i];
        }

        if (!even) {
            ret -= mat[l / 2][l / 2];
        }

        return ret;
    }
}
