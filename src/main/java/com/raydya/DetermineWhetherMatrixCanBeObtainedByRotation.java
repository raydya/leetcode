package com.raydya;

import java.util.Arrays;

public class DetermineWhetherMatrixCanBeObtainedByRotation {

    public boolean findRotation(int[][] mat, int[][] target) {
        int[][] t = mat;
        for (int i = 0; i < 4; i++) {
            if (Arrays.deepEquals(t, target)) {
                return true;
            }
            t = rotateClockwise(t);
        }

        return false;
    }

    private int[][] rotateClockwise(int[][] matrix) {
        final int m = matrix.length;
        final int n = matrix[0].length;
        final int[][] rotated = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][m - i - 1] = matrix[i][j];
            }
        }

        return rotated;
    }

}
