package com.raydya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RottingOranges {

    public int orangesRotting(int[][] grid) {
        final int m = grid.length;
        final int n = grid[0].length;
        final boolean[][] visited = new boolean[m][n];

        int t = 0;
        while (true) {
            List<List<Integer>> rottingOranges = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (!visited[i][j] && grid[i][j] == 2) {
                        rottingOranges.add(Arrays.asList(i, j));
                        visited[i][j] = true;
                    }
                }
            }
            if (rottingOranges.isEmpty()) {
                break;
            }
            for (List<Integer> rottingOrange : rottingOranges) {
                Integer x = rottingOrange.get(0);
                Integer y = rottingOrange.get(1);
                corrupt(grid, x - 1, y);
                corrupt(grid, x + 1, y);
                corrupt(grid, x, y - 1);
                corrupt(grid, x, y + 1);
            }
            t++;
        }

        for (int[] ints : grid) {
            for (int j = 0; j < n; j++) {
                if (ints[j] == 1) {
                    return -1;
                }
            }
        }

        return Math.max(t - 1, 0);
    }

    private void corrupt(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
            return;
        }

        if (grid[i][j] == 1) {
            grid[i][j] = 2;
        }
    }

}
