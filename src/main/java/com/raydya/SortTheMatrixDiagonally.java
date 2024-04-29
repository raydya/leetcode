package com.raydya;

import java.util.Arrays;

/**
 * 矩阵对角线排序
 */
public class SortTheMatrixDiagonally {

    public int[][] diagonalSort(int[][] mat) {
        final int m = mat.length;
        final int n = mat[0].length;
        for (int i = 0; i < m; i++) {
            sort(mat, i, 0);
        }
        for (int i = 1; i < n; i++) {
            sort(mat, 0, i);
        }
        return mat;
    }

    private void sort(int[][] mat, int i, int j) {
        final int m = mat.length;
        final int n = mat[0].length;
        final int[] arr = new int[Math.min(m - i, n - j)];
        for (int k = 0; k < arr.length; k++) {
            arr[k] = mat[i + k][j + k];
        }
        Arrays.sort(arr);
        for (int k = 0; k < arr.length; k++) {
            mat[i + k][j + k] = arr[k];
        }
    }

}
