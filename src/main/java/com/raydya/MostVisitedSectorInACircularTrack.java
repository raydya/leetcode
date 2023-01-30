package com.raydya;

import java.util.ArrayList;
import java.util.List;

public class MostVisitedSectorInACircularTrack {

    public List<Integer> mostVisited(int n, int[] rounds) {
        final int[] sectors = new int[n];
        int max = 0;
        int p = rounds[0];
        for (int i = 1; i < rounds.length; i++) {
            final int s = p;
            final int e = rounds[i] > s ? rounds[i] : rounds[i] + n;
            for (int j = s; j <= e; j++) {
                sectors[(j - 1) % n]++;
                max = Math.max(max, sectors[(j - 1) % n]);
            }
            p = rounds[i] + 1;
        }

        final List<Integer> ret = new ArrayList<>();

        for (int i = 0; i < sectors.length; i++) {
            if (sectors[i] == max) {
                ret.add(i + 1);
            }
        }

        return ret;
    }

}
