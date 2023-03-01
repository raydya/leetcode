package com.raydya;

public class LargestLocalValuesInAMatrix {

    public int[][] largestLocal(int[][] grid) {
        final int n = grid.length;
        final int m = n - 2;
        final int[][] maxLocal = new int[m][m];

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                int max = Integer.MIN_VALUE;
                for (int k = i - 1; k <= i + 1; k++) {
                    for (int l = j - 1; l <= j + 1; l++) {
                        max = Math.max(max, grid[k][l]);
                    }
                }
                maxLocal[i - 1][j - 1] = max;
            }
        }

        return maxLocal;
    }

}
