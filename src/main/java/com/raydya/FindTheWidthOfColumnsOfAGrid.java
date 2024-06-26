package com.raydya;

public class FindTheWidthOfColumnsOfAGrid {

    public int[] findColumnWidth(int[][] grid) {
        final int[] widths = new int[grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            final int[] row = grid[i];
            for (int j = 0; j < row.length; j++) {
                final int v = row[j];
                final int l = String.valueOf(v).length();
                if (l > widths[j]) {
                    widths[j] = l;
                }
            }
        }

        return widths;
    }

}
