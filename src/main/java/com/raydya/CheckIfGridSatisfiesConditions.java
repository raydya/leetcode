package com.raydya;

public class CheckIfGridSatisfiesConditions {

    public boolean satisfiesConditions(int[][] grid) {
        final int m = grid.length;
        final int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                final int v = grid[i][j];
                if (i + 1 < m && grid[i + 1][j] != v) {
                    return false;
                }
                if (j + 1 < n && grid[i][j + 1] == v) {
                    return false;
                }
            }
        }

        return true;
    }

}
