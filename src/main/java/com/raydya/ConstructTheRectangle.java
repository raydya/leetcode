package com.raydya;

public class ConstructTheRectangle {

    public int[] constructRectangle(int area) {
        final double sqrt = Math.sqrt(area);
        int l = (int) sqrt;
        int w = (int) sqrt;
        int g = Integer.MAX_VALUE;

        for (int i = w; i > 0; i--) {
            final int tl = area / i;
            final int r = area % i;
            if (r == 0 && g > tl - w) {
                w = i;
                l = tl;
                g = l - w;
            }
        }

        return new int[]{l, w};
    }
}
