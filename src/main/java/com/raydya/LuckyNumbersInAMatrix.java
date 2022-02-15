package com.raydya;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInAMatrix {
    public List<Integer> luckyNumbers(int[][] matrix) {
        final int m = matrix.length;
        final int n = matrix[0].length;

        final int[] mins = new int[m];

        for (int i = 0; i < m; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                final int k = matrix[i][j];
                min = Math.min(k, min);
            }
            mins[i] = min;
        }

        final int[] maxs = new int[n];

        for (int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < m; j++) {
                final int k = matrix[j][i];
                max = Math.max(k, max);
            }
            maxs[i] = max;
        }

        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                final int k = matrix[i][j];
                if (mins[i] == k && maxs[j] == k) {
                    ret.add(k);
                }
            }
        }

        return ret;
    }
}
