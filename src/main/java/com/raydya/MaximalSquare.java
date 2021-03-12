package com.raydya;

public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        final int m = matrix.length;
        final int n = matrix[0].length;

        int[][] dp = new int[m][n];

        int side = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                final char c = matrix[i][j];
                if (c == '1') {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    }
                    side = Math.max(side, dp[i][j]);
                }
            }
        }

        return side * side;
    }
}
