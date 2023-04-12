package com.raydya;

import java.util.HashMap;
import java.util.Map;

public class FindCenterOfStarGraph {

    public int findCenter(int[][] edges) {
        final Map<Integer, Integer> m = new HashMap<>();
        final int l = edges.length;
        int n = 0;
        for (final int[] edge : edges) {
            final int s = edge[0];
            final int e = edge[1];
            final int sv = m.getOrDefault(s, 0) + 1;
            final int ev = m.getOrDefault(e, 0) + 1;
            m.put(s, sv);
            m.put(e, ev);
            if (sv == l) {
                n = s;
                break;
            }
            if (ev == l) {
                n = e;
                break;
            }
        }

        return n;
    }

}
