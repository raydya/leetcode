package com.raydya;

import java.util.Arrays;

public class ProjectAreaOf3DShapes {
    public int projectionArea(int[][] grid) {
        int xy = 0;
        int yz = 0;
        int zx;

        final int[] k = new int[grid.length];
        for (final int[] ints : grid) {
            int maxYz = 0;
            for (int j = 0; j < ints.length; j++) {
                if (ints[j] == 0) continue;
                xy++;
                maxYz = Math.max(ints[j], maxYz);
                k[j] = Math.max(ints[j], k[j]);
            }
            yz += maxYz;
        }

        zx = Arrays.stream(k).sum();

        return xy + yz + zx;
    }
}
