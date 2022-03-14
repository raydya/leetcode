package com.raydya;

import java.util.ArrayList;
import java.util.List;

public class Shift2DGrid {

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        final int l = grid.length;
        final int c = grid[0].length;
        final List<List<Integer>> ret = new ArrayList<>(l);
        for (int i = 0; i < l; i++) {
            final List<Integer> row = new ArrayList<>(c);
            for (int j = 0; j < c; j++) {
                row.add(0);
            }
            ret.add(row);
        }

        k = k % (l * c);
        for (int i = 0; i < l; i++) {
            final int[] r = grid[i];
            final int rl = r.length;
            for (int j = 0; j < rl; j++) {
                int m = (i + (j + k) / rl) % l;
                int n = (j + k) % rl;
                final List<Integer> x = ret.get(m);
                x.set(n, grid[i][j]);
                ret.set(m, x);
            }
        }

        return ret;
    }
}
