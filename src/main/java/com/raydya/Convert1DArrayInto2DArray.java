package com.raydya;

public class Convert1DArrayInto2DArray {

    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) {
            return new int[][]{};
        }

        final int[][] ret = new int[m][n];
        for (int i = 0; i < original.length; i++) {
            final int v = original[i];
            final int x = i / n;
            final int y = i % n;
            ret[x][y] = v;
        }

        return ret;
    }

}
