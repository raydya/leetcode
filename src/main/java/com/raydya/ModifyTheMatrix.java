package com.raydya;

public class ModifyTheMatrix {

    public int[][] modifiedMatrix(int[][] matrix) {
        final int m = matrix.length;
        final int n = matrix[0].length;
        final int[][] ans = new int[m][n];

        final int[] columnMax = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                final int v = matrix[j][i];
                columnMax[i] = Math.max(columnMax[i], v);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1) {
                    ans[i][j] = columnMax[j];
                } else {
                    ans[i][j] = matrix[i][j];
                }
            }
        }

        return ans;
    }

}
