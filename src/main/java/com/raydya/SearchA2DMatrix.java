package com.raydya;

public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) return false;
        if (matrix[0].length == 0) return false;

        final int m = matrix.length;
        final int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            final int v1 = matrix[i][0];
            final int v2 = i + 1 >= m ? Integer.MAX_VALUE : matrix[i + 1][0];

            if (v2 >= target && target >= v1) {
                for (int j = 0; j < n; j++) {
                    final int v3 = matrix[i][j];
                    if (v3 == target) return true;
                }
            }
        }

        return false;
    }
}
