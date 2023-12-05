package com.raydya;

import java.util.ArrayList;
import java.util.List;

public class MinimumFuelCostToReportToTheCapital {

    private long res = 0;

    public long minimumFuelCost(int[][] roads, int seats) {
        final int n = roads.length;
        final List<Integer>[] g = new List[n + 1];
        for (int i = 0; i <= n; i++) {
            g[i] = new ArrayList<>();
        }

        for (final int[] road : roads) {
            g[road[0]].add(road[1]);
            g[road[1]].add(road[0]);
        }

        dfs(0, -1, seats, g);
        return res;
    }

    private int dfs(int cur, int fa, int seats, List<Integer>[] g) {
        int peopleSum = 1;
        for (final int ne : g[cur]) {
            if (ne != fa) {
                int peopleCnt = dfs(ne, cur, seats, g);
                peopleSum += peopleCnt;
                res += (peopleCnt + seats - 1) / seats;
            }
        }

        return peopleSum;
    }

}
