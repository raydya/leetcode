package com.raydya;

public class ImageSmoother {
    public int[][] imageSmoother(int[][] img) {
        final int[][] ret = new int[img.length][img[0].length];

        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                ret[i][j] = smooth(img, i, j);
            }
        }

        return ret;
    }

    private int smooth(int[][] img, int i, int j) {
        int m = 0;
        int d = 0;

        for (int k = -1; k < 2; k++) {
            for (int l = -1; l < 2; l++) {
                final int v = get(img, i + k, j + l);
                if (v == -1) continue;
                m += v;
                d++;
            }
        }

        return (int) Math.floor(m / (double) d);
    }

    private int get(int[][] img, int i, int j) {
        if (i < 0 || j < 0 || i >= img.length || j >= img[0].length) return -1;
        return img[i][j];
    }
}
