package com.raydya;

public class MaximumRowsCoveredByColumns {

    public int maximumRows(int[][] matrix, int numSelect) {
        final int m = matrix.length;
        final int n = matrix[0].length;
        int[] mask = new int[m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mask[i] += matrix[i][j] << (n - j - 1);
            }
        }

        int res = 0;
        int cur = (1 << numSelect) - 1;
        int limit = (1 << n);
        while (cur < limit) {
            int t = 0;
            for (int j = 0; j < m; j++) {
                if ((mask[j] & cur) == mask[j]) {
                    ++t;
                }
            }
            res = Math.max(res, t);
            int lb = cur & -cur;
            int r = cur + lb;
            cur = ((r ^ cur) >> Integer.numberOfTrailingZeros(lb) + 2) | r;
        }
        return res;
    }

}
