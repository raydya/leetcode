package com.raydya;

public class MaximumPopulationYear {

    public int maximumPopulation(int[][] logs) {
        int max = 0;
        final int[] h = new int[101];
        for (int i = 1950; i <= 2050; i++) {
            for (final int[] log : logs) {
                final int birth = log[0];
                final int death = log[1];
                if (i >= birth && i < death) {
                    final int k = i - 1950;
                    h[k]++;
                    max = Math.max(h[k], max);
                }
            }
        }

        for (int i = 1950; i <= 2050; i++) {
            if (h[i - 1950] == max) {
                return i;
            }
        }

        return -1;
    }

}
