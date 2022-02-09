package com.raydya;

public class CountNegativeNumbersInASortedMatrix {
    public int countNegatives(int[][] grid) {
        int c = 0;
        for (final int[] r : grid) {
            final int m = r[0];
            if (m < 0) {
                c += r.length;
                continue;
            }
            final int n = r[r.length - 1];
            if (n >= 0) {
                continue;
            }
            for (int j = r.length - 1; j >= 0; j--) {
                if (r[j] < 0) c++;
                if (r[j] >= 0) break;
            }
        }

        return c;
    }
}
