package com.raydya;

public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        final int m = mat.length;
        final int n = mat[0].length;

        if (m * n != r * c) return mat;

        int[][] ret = new int[r][c];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                final int k = i * n + j;
                final int x = k / c;
                final int y = k % c;
                ret[x][y] = mat[i][j];
            }
        }

        return ret;
    }
}
