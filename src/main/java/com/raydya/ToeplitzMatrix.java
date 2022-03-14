package com.raydya;

import java.util.Arrays;

public class ToeplitzMatrix {

    public boolean isToeplitzMatrix(int[][] matrix) {
        int[] row = matrix[0];
        for (int i = 1; i < matrix.length; i++) {
            final int[] a1 = Arrays.copyOfRange(row, 0, row.length - 1);
            final int[] a2 = Arrays.copyOfRange(matrix[i], 1, row.length);
            if (!Arrays.equals(a1, a2)) {
                return false;
            }
            row = matrix[i];
        }
        return true;
    }
}
