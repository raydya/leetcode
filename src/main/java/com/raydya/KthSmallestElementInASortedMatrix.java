package com.raydya;

import java.util.Arrays;

public class KthSmallestElementInASortedMatrix {

    public int kthSmallest(int[][] matrix, int k) {
        final int m = matrix.length;
        final int n = matrix[0].length;

        final int[] ints = new int[m * n];
        int l = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ints[l] = matrix[i][j];
                l++;
            }
        }

        Arrays.sort(ints);

        return ints[k - 1];
    }
}
