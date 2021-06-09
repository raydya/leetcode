package com.raydya;

public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        final int m = grid.length;
        final int n = grid[0].length;

        int perimeter = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                final int k = grid[i][j];
                if (k == 0) continue;

                if (i - 1 < 0 || grid[i - 1][j] == 0) perimeter++;
                if (j - 1 < 0 || grid[i][j - 1] == 0) perimeter++;
                if (i + 1 >= m || grid[i + 1][j] == 0) perimeter++;
                if (j + 1 >= n || grid[i][j + 1] == 0) perimeter++;
            }
        }

        return perimeter;
    }
}
