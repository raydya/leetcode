package com.raydya;

public class TransposeMatrix {

    public int[][] transpose(int[][] matrix) {
        final int m = matrix.length;
        final int n = matrix[0].length;

        final int[][] h = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                h[j][i] = matrix[i][j];
            }
        }

        return h;
    }
}
