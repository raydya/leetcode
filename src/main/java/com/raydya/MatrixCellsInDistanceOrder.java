package com.raydya;

import java.util.Arrays;
import java.util.Comparator;

public class MatrixCellsInDistanceOrder {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        final int k = rows * cols;
        final int[][] ret = new int[k][2];

        for (int i = 0; i < ret.length; i++) {
            ret[i][0] = i % rows;
            ret[i][1] = i / rows;
        }

        Arrays.sort(
            ret,
            Comparator.comparingInt(a -> Math.abs(rCenter - a[0]) + Math.abs(cCenter - a[1]))
        );

        return ret;
    }
}
