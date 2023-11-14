package com.raydya;

public class FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance {

    // finished by Copilot!
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        final int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            final int[] d = dp[i];
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    d[j] = 0;
                } else {
                    d[j] = Integer.MAX_VALUE;
                }
            }
        }

        for (final int[] edge : edges) {
            final int s = edge[0];
            final int e = edge[1];
            final int w = edge[2];
            dp[s][e] = w;
            dp[e][s] = w;
        }

        for (int k = 0; k < n; k++) {
            final int[] dk = dp[k];
            for (int i = 0; i < n; i++) {
                final int[] di = dp[i];
                for (int j = 0; j < n; j++) {
                    final int[] dj = dp[j];
                    if (di[k] != Integer.MAX_VALUE && dk[j] != Integer.MAX_VALUE) {
                        di[j] = Math.min(di[j], di[k] + dk[j]);
                        dj[i] = di[j];
                    }
                }
            }
        }

        int min = Integer.MAX_VALUE;
        int idx = -1;
        for (int i = 0; i < n; i++) {
            final int[] di = dp[i];
            int count = 0;
            for (final int d : di) {
                if (d <= distanceThreshold) {
                    count++;
                }
            }
            if (count <= min) {
                min = count;
                idx = i;
            }
        }

        return idx;
    }

}
