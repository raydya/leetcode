package com.raydya;

public class LargestTriangleArea {

    public double largestTriangleArea(int[][] points) {
        final int l = points.length;
        double ans = 0;
        for (int i = 0; i < l; ++i) {
            for (int j = i + 1; j < l; ++j) {
                for (int k = j + 1; k < l; ++k) {
                    ans = Math.max(ans, area(points[i], points[j], points[k]));
                }
            }
        }
        return ans;
    }

    private double area(int[] p, int[] q, int[] r) {
        return 0.5 * Math.abs(
            p[0] * q[1] + q[0] * r[1] + r[0] * p[1] - p[1] * q[0] - q[1] * r[0] - r[1] * p[0]);
    }
}
