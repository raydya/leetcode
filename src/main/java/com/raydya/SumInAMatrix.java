package com.raydya;

public class SumInAMatrix {

    public int matrixSum(int[][] nums) {
        int r = 0;
        int k = 0;
        int l = nums[0].length;
        while (k < l) {
            int t = 0;
            for (final int[] row : nums) {
                int m = 0;
                int z = 0;
                for (int j = 0; j < row.length; j++) {
                    if (row[j] > m) {
                        m = row[j];
                        z = j;
                    }
                }
                row[z] = -1;
                t = Math.max(t, m);
            }
            r += t;
            k++;
        }

        return r;
    }

}
