package com.raydya;

import java.util.Arrays;

public class SumInAMatrix {

    public int matrixSum(int[][] nums) {
        int r = 0;
        int k = 0;
        int l = nums[0].length;
        for (final int[] row : nums) {
            Arrays.sort(row);
        }

        while (k < l) {
            int t = 0;
            for (final int[] row : nums) {
                int m = row[l - 1 - k];
                int z = l - 1 - k;
                row[z] = -1;
                t = Math.max(t, m);
            }
            r += t;
            k++;
        }

        return r;
    }

}
