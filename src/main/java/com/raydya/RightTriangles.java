package com.raydya;

public class RightTriangles {

    public long numberOfRightTriangles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        long count = 0;

        // Count ones in each row and column
        long[] rowCount = new long[m];
        long[] colCount = new long[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }

        // Check each '1' in the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    // Count right-angle triangles for this '1'
                    count += (rowCount[i] - 1) * (colCount[j] - 1);
                }
            }
        }

        return count;
    }

}
