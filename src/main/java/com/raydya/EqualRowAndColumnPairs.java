package com.raydya;

import java.util.Arrays;

public class EqualRowAndColumnPairs {

    public int equalPairs(int[][] grid) {
        final int n = grid.length;

        int rs = 0;

        final int[][] ng = new int[n][n];
        for (int i = 0; i < n; i++) {
            final int[] t = new int[n];
            for (int j = 0; j < n; j++) {
                t[j] = grid[j][i];
            }
            ng[i] = t;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Arrays.equals(grid[i], ng[j])) {
                    rs++;
                }
            }
        }

        return rs;
    }

}
