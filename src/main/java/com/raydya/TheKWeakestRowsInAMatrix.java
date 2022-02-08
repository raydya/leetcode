package com.raydya;

import java.util.Arrays;

public class TheKWeakestRowsInAMatrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        final int[] ret = new int[k];

        final int ml = mat.length;
        final int rl = mat[0].length;
        final int[] power = new int[ml];

        for (int i = 0; i < ml; i++) {
            for (int j = 0; j < rl; j++) {
                final int t = mat[i][j];
                if (t == 0) break;
                power[i] += t;
            }
        }

        final int[] t = power.clone();
        Arrays.sort(t);

        for (int i = 0; i < k; i++) {
            final int v = t[i];
            for (int j = 0; j < power.length; j++) {
                if (power[j] == v) {
                    ret[i] = j;
                    power[j] = -1;
                    break;
                }
            }
        }

        return ret;
    }
}
