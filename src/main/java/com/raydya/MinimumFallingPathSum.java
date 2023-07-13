package com.raydya;

public class MinimumFallingPathSum {

    public int minFallingPathSum(int[][] matrix) {
        final int n = matrix.length;
        int[][] dp = new int[n][n];
        System.arraycopy(matrix[0], 0, dp[0], 0, n);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int mn = dp[i - 1][j];
                if (j > 0) {
                    mn = Math.min(mn, dp[i - 1][j - 1]);
                }

                if (j < n - 1) {
                    mn = Math.min(mn, dp[i - 1][j + 1]);
                }

                dp[i][j] = mn + matrix[i][j];
            }
        }

        int s = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            s = Math.min(s, dp[n - 1][i]);
        }

        return s;
    }


}
