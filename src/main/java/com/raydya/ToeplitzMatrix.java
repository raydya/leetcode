package com.raydya;

import java.util.Arrays;

public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int[] row = matrix[0];
        for (int i = 1; i < matrix.length; i++) {
            final int[] a1 = Arrays.copyOfRange(row, 0, row.length - 1);
            final int[] a2 = Arrays.copyOfRange(matrix[i], 1, row.length);
            if (!Arrays.equals(a1, a2)) return false;
            row = matrix[i];
        }
        return true;
    }

    private boolean isTopAndRightSame(int[][] matrix, int c, int r) {
        final int top = r - 1;
        final int right = c + 1;
        if (top < 0) return true;
        if (right > matrix[0].length - 1) return true;
        if (matrix[top][c] == matrix[r][right]) {
            return isTopAndRightSame(matrix, c, top) && isTopAndRightSame(matrix, right, r);
        }
        return false;
    }
}
