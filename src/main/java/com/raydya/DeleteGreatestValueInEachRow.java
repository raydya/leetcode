package com.raydya;

import java.util.Arrays;

public class DeleteGreatestValueInEachRow {

    public int deleteGreatestValue(int[][] grid) {
        final int n = grid[0].length;
        for (final int[] ints : grid) {
            Arrays.sort(ints);
        }

        int s = 0;
        for (int i = 0; i < n; i++) {
            int t = 0;
            for (final int[] ints : grid) {
                t = Math.max(t, ints[i]);
            }
            s += t;
        }

        return s;
    }

}
