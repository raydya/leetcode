package com.raydya;

public class SpiralMatrixII {

    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int r1 = 0, r2 = n - 1;
        int c1 = 0, c2 = n - 1;
        int num = 1;

        // LAYER BY LAYER
        while (r1 <= r2 && c1 <= c2) {
            // TOP
            for (int c = c1; c <= c2; c++) {
                matrix[r1][c] = num;
                num++;
            }
            // RIGHT
            for (int r = r1 + 1; r <= r2; r++) {
                matrix[r][c2] = num;
                num++;
            }

            if (r1 < r2 && c1 < c2) {
                // BOTTOM
                for (int c = c2 - 1; c > c1; c--) {
                    matrix[r2][c] = num;
                    num++;
                }

                // LEFT
                for (int r = r2; r > r1; r--) {
                    matrix[r][c1] = num;
                    num++;
                }
            }
            // INNER LAYER
            r1++;
            r2--;
            c1++;
            c2--;
        }

        return matrix;
    }
}
