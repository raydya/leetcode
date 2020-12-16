package com.raydya;

public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        final int m = obstacleGrid.length;
        final int n = obstacleGrid[0].length;

        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    if (i == 0 && j == 0) {
                        dp[i][j] = 1;
                    } else {
                        final int left = i - 1;
                        final int up = j - 1;
                        final int leftPaths = left < 0 ? 0 : dp[left][j];
                        final int rightPaths = up < 0 ? 0 : dp[i][up];
                        dp[i][j] = leftPaths + rightPaths;
                    }
                }
            }
        }

        return dp[m - 1][n - 1];
    }
}
