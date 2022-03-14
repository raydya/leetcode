package com.raydya;

public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        final int r = grid.length;
        final int c = grid[0].length;
        final boolean[][] visited = new boolean[r][c];
        int num = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                final char n = grid[i][j];
                if (n == '1' && !visited[i][j]) {
                    num++;
                    markBorderConnectedOne(visited, grid, i, j, r, c);
                }
            }
        }

        return num;
    }

    private void markBorderConnectedOne(boolean[][] visited, char[][] grid, int i, int j, int r,
        int c) {
        if (i < 0 || i >= r) {
            return;
        }
        if (j < 0 || j >= c) {
            return;
        }

        final char n = grid[i][j];
        if (n == '0' || visited[i][j]) {
            return;
        }

        visited[i][j] = true;

        markBorderConnectedOne(visited, grid, i - 1, j, r, c);
        markBorderConnectedOne(visited, grid, i + 1, j, r, c);
        markBorderConnectedOne(visited, grid, i, j - 1, r, c);
        markBorderConnectedOne(visited, grid, i, j + 1, r, c);
    }
}
