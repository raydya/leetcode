package com.raydya;

public class ValidBoomerang {

    public boolean isBoomerang(int[][] points) {
        final int[] a = points[0];
        final int[] b = points[1];
        final int[] c = points[2];
        final int x1 = a[0];
        final int y1 = a[1];
        final int x2 = b[0];
        final int y2 = b[1];
        final int x3 = c[0];
        final int y3 = c[1];

        double s = (x1 * y2 - x2 * y1 + x2 * y3 - x3 * y2 + x3 * y1 - x1 * y3) / 2.0;

        return s != 0.0;
    }
}
