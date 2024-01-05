package com.raydya;

import java.util.Arrays;

public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {

    public int maxWidthOfVerticalArea(int[][] points) {
        int[] p = new int[points.length];

        for (int i = 0; i < points.length; i++) {
            final int[] point = points[i];
            final int x = point[0];
            p[i] = x;
        }

        Arrays.sort(p);

        int max = 0;
        int prev = p[0];
        for (int i = 1; i < p.length; i++) {
            final int cur = p[i];
            final int diff = cur - prev;
            if (diff > max) {
                max = diff;
            }
            prev = cur;
        }

        return max;
    }

}
