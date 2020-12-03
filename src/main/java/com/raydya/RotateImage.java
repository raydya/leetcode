package com.raydya;

public class RotateImage {

    // I haven't rotate the array in place, instead of allocate a new matrix
    public void rotate(int[][] matrix) {
        final int n = matrix.length;

        int[][] clone = new int[n][n];
        for (int i = 0; i < n; i++) {
            clone[i] = matrix[i].clone();
        }

        for (int i = 0; i < n; i++) {
            final int[] row = clone[i];
            final int columnIndex = n - i - 1;

            for (int j = 0; j < n; j++) {
                matrix[j][columnIndex] = row[j];
            }
        }
    }
}
