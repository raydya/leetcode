package com.raydya;

import java.util.Arrays;

public class MinimumRectanglesToCoverPoints {

    public int minRectanglesToCoverPoints(int[][] points, int w) {
        if (points == null || points.length == 0) {
            return 0;
        }

        // Sort points by x-coordinate, then by y-coordinate
        Arrays.sort(points, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        int count = 0;
        int n = points.length;
        int i = 0;

        while (i < n) {
            int startX = points[i][0];
            int maxY = points[i][1];
            int j = i + 1;

            // Find the maximum y-coordinate within the current window
            while (j < n && points[j][0] - startX <= w) {
                maxY = Math.max(maxY, points[j][1]);
                j++;
            }

            count++;

            // Move i to the first point not covered by the current rectangle
            while (i < n && (points[i][0] - startX <= w && points[i][1] <= maxY)) {
                i++;
            }
        }

        return count;
    }

}
