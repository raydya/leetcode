package com.raydya;

public class MaxAreaOfIsland {

    private int[][] visited;
    private int[][] oGrid;

    public int maxAreaOfIsland(int[][] grid) {
        this.oGrid = grid;
        final int m = oGrid.length;
        final int n = oGrid[0].length;
        visited = new int[m][n];

        int max = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                final int k = oGrid[i][j];
                if (k == 0) {
                    continue;
                }
                final int area = getArea(i, j, 0);
                max = Math.max(area, max);
            }
        }

        return max;
    }

    private int getArea(int x, int y, int s) {
        final int m = oGrid.length;
        final int n = oGrid[0].length;

        if (x < 0 || y < 0 || x > m - 1 || y > n - 1) {
            return 0;
        }

        if (visited[x][y] == 1) {
            return 0;
        }

        if (oGrid[x][y] == 0) {
            return 0;
        }

        s++;
        visited[x][y] = 1;
        return s + getArea(x - 1, y, 0)
            + getArea(x + 1, y, 0)
            + getArea(x, y - 1, 0)
            + getArea(x, y + 1, 0);
    }
}
