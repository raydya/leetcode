package com.raydya;

import java.util.HashMap;
import java.util.Map;

public class NumberOfRectanglesThatCanFormTheLargestSquare {

    public int countGoodRectangles(int[][] rectangles) {
        int j = 0;
        final Map<Integer, Integer> m = new HashMap<>();
        for (final int[] rectangle : rectangles) {
            final int l = rectangle[0];
            final int w = rectangle[1];
            final int k = Math.min(l, w);
            j = Math.max(j, k);
            final int n = m.getOrDefault(k, 0) + 1;
            m.put(k, n);
        }

        return m.get(j);
    }

}
