package com.raydya;

import java.util.Arrays;
import java.util.List;

public class MaximumDifferenceScoreInAGrid {

    public int maxScore(List<List<Integer>> grid) {
        int m = grid.size(), n = grid.get(0).size();
        int[][] premin = new int[2][n];
        for (int i = 0; i < 2; ++i) {
            Arrays.fill(premin[i], Integer.MAX_VALUE);
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < m; ++i) {
            Arrays.fill(premin[i & 1], Integer.MAX_VALUE);
            for (int j = 0; j < n; ++j) {
                int pre = Integer.MAX_VALUE;
                if (i > 0) {
                    pre = Math.min(pre, premin[(i - 1) & 1][j]);
                }
                if (j > 0) {
                    pre = Math.min(pre, premin[i & 1][j - 1]);
                }
                // i = j = 0 时没有转移
                if (i + j > 0) {
                    ans = Math.max(ans, grid.get(i).get(j) - pre);
                }
                premin[i & 1][j] = Math.min(pre, grid.get(i).get(j));
            }
        }
        return ans;
    }
}
