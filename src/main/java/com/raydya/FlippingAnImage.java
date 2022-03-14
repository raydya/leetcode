package com.raydya;

public class FlippingAnImage {

    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            final int[] r = image[i];
            final int k = r.length / 2;
            final int m = r.length % 2;
            for (int j = 0; j < k + m; j++) {
                final int v1 = Math.abs(r[j] - 1);
                final int v2 = Math.abs(r[r.length - j - 1] - 1);
                image[i][j] = v2;
                image[i][r.length - j - 1] = v1;
            }
        }

        return image;
    }
}
