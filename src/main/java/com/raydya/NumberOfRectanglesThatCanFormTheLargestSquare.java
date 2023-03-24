package com.raydya;

public class NumberOfRectanglesThatCanFormTheLargestSquare {

    public int countGoodRectangles(int[][] rectangles) {
        final int[] f = new int[rectangles.length];
        int m = 0;

        for (int i = 0; i < rectangles.length; i++) {
            final int[] rectangle = rectangles[i];
            final int l = rectangle[0];
            final int w = rectangle[1];
            final int k = Math.min(l, w);
            f[i] = k;
            m = Math.max(m, k);
        }

        int r = 0;
        for (final int j : f) {
            if (j == m) {
                r++;
            }
        }

        return r;
    }

}
