package com.raydya;

public class MinimumTimeVisitingAllPoints {
    public int minTimeToVisitAllPoints(int[][] points) {
        int t = 0;
        for (int i = 0; i < points.length - 1; i++) {
            final int[] s = points[i];
            final int[] e = points[i + 1];

            t += Math.max(Math.abs(s[0] - e[0]), Math.abs(s[1] - e[1]));
        }

        return t;
    }
}
