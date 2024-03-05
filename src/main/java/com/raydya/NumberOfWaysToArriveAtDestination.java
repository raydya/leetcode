package com.raydya;

import java.util.Arrays;
import java.util.PriorityQueue;

public class NumberOfWaysToArriveAtDestination {

    private static final int MOD = 1_000_000_007;
    private static final long INF = Long.MAX_VALUE / 2;

    public int countPaths(int n, int[][] roads) {
        long[][] graph = new long[n][n];
        for (long[] row : graph) {
            Arrays.fill(row, INF);
        }

        for (int[] road : roads) {
            int u = road[0], v = road[1], time = road[2];
            graph[u][v] = graph[v][u] = time;
        }

        long[] dist = new long[n];
        Arrays.fill(dist, INF);
        dist[0] = 0;

        long[] count = new long[n];
        Arrays.fill(count, 0);
        count[0] = 1;

        PriorityQueue<long[]> minHeap = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));
        minHeap.offer(new long[]{0, 0});

        while (!minHeap.isEmpty()) {
            long[] top = minHeap.poll();
            long d = top[0], u = top[1];
            if (d != dist[(int) u]) {
                continue;
            }
            for (int v = 0; v < n; ++v) {
                if (dist[v] > dist[(int) u] + graph[(int) u][v]) {
                    dist[v] = dist[(int) u] + graph[(int) u][v];
                    count[v] = count[(int) u];
                    minHeap.offer(new long[]{dist[v], v});
                } else if (dist[v] == dist[(int) u] + graph[(int) u][v]) {
                    count[v] = (count[v] + count[(int) u]) % MOD;
                }
            }
        }

        return (int) count[n - 1];
    }
}
