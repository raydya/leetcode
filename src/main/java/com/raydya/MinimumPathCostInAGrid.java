package com.raydya;

import java.util.Arrays;

public class MinimumPathCostInAGrid {

    public int minPathCost(int[][] grid, int[][] moveCost) {
        final int l = grid.length;
        final int[][] dp = new int[l][grid[0].length];
        for (final int[] ints : dp) {
            Arrays.fill(ints, Integer.MAX_VALUE);
        }
        dp[0] = grid[0];

        for (int i = 0; i < l - 1; i++) {
            final int[] row = grid[i];
            for (int j = 0; j < row.length; j++) {
                final int k = row[j];
                final int[] costs = moveCost[k];

                for (int m = 0; m < costs.length; m++) {
                    final int cost = costs[m];
                    final int pdp = dp[i][j];
                    final int n = grid[i + 1][m];
                    dp[i + 1][m] = Math.min(pdp + cost + n, dp[i + 1][m]);
                }
            }
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < dp[dp.length - 1].length; i++) {
            min = Math.min(min, dp[dp.length - 1][i]);
        }

        return min;
    }

}
