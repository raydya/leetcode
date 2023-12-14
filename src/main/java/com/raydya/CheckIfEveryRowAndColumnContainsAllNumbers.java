package com.raydya;

import java.util.HashSet;
import java.util.Set;

public class CheckIfEveryRowAndColumnContainsAllNumbers {

    public boolean checkValid(int[][] matrix) {
        final int n = matrix.length;

        Set<Integer> t = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            t.add(i);
        }

        for (final int[] row : matrix) {
            Set<Integer> t0 = new HashSet<>(t);
            for (final int k : row) {
                t0.remove(k);
            }

            if (!t0.isEmpty()) {
                return false;
            }
        }

        for (int i = 0; i < n; i++) {
            Set<Integer> t0 = new HashSet<>(t);
            for (final int[] ints : matrix) {
                final int k = ints[i];
                t0.remove(k);
            }

            if (!t0.isEmpty()) {
                return false;
            }
        }

        return true;
    }

}
