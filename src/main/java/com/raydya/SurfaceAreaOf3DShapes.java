package com.raydya;

public class SurfaceAreaOf3DShapes {
    public int surfaceArea(int[][] grid) {
        int t = 0;
        final int m = grid.length;
        final int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                final int g = grid[i][j];
                if (g == 0) continue;
                // 底面 & 顶面
                t += 2;

                // top
                if (i - 1 >= 0) {
                    t += Math.max(0, g - grid[i - 1][j]);
                } else {
                    t += g;
                }
                // bottom
                if (i + 1 < m) {
                    t += Math.max(0, g - grid[i + 1][j]);
                } else {
                    t += g;
                }
                // left
                if (j - 1 >= 0) {
                    t += Math.max(0, g - grid[i][j - 1]);
                } else {
                    t += g;
                }
                // right
                if (j + 1 < n) {
                    t += Math.max(0, g - grid[i][j + 1]);
                } else {
                    t += g;
                }
            }
        }

        return t;
    }
}
