package com.raydya;

public class FindChampionI {

    public int findChampion(int[][] grid) {
        final int n = grid.length;
        final int[] wins = new int[n];
        final int[] loses = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                final int result = grid[i][j];
                if (result == 1) {
                    wins[i]++;
                    loses[j]++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (wins[i] == n - 1 && loses[i] == 0) {
                return i;
            }
        }

        return -1;
    }

}
