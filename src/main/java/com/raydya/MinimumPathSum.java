package com.raydya;

import java.util.Arrays;

public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        final int m = grid.length;
        final int n = grid[0].length;

        final int[][] dp = Arrays.copyOf(grid, grid.length);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                final int l = i - 1;
                final int u = j - 1;
                final int lw = l < 0 ? 0 : dp[l][j];
                final int uw = u < 0 ? 0 : dp[i][u];
                int t;
                if (l < 0 || u < 0) {
                    t = Math.max(lw, uw);
                } else {
                    t = Math.min(lw, uw);
                }
                dp[i][j] = t + dp[i][j];
            }
        }

        return dp[m - 1][n - 1];
    }
}
