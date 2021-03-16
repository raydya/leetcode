package com.raydya;

import java.util.Arrays;

public class SearchA2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (final int[] row : matrix) {
            final int e = row[row.length - 1];
            if (target > e) continue;
            if (target == e) return true;
            final int k = Arrays.binarySearch(row, target);
            if (k >= 0) return true;
        }
        return false;
    }
}
