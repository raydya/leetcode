package com.raydya;

public class CheckIfMatrixIsXMatrix {

    public boolean checkXMatrix(int[][] grid) {
        final int m = grid.length;
        final int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || (i + j) == m - 1) {
                    if (grid[i][j] == 0) {
                        return false;
                    }
                } else {
                    if (grid[i][j] != 0) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

}
