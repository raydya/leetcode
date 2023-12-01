package com.raydya;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FirstCompletelyPaintedRowOrColumn {

    public int firstCompleteIndex(int[] arr, int[][] mat) {
        final int m = mat.length;
        final int n = mat[0].length;

        final Map<Integer, Set<Integer>> rMap = new HashMap<>();
        final Map<Integer, Set<Integer>> cMap = new HashMap<>();
        final Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            final Set<Integer> rSet = new HashSet<>();
            for (int j = 0; j < n; j++) {
                final int k = mat[i][j];
                final List<Integer> indexes = Arrays.asList(i, j);
                map.put(k, indexes);
                rSet.add(k);

                final Set<Integer> cSet = cMap.getOrDefault(j, new HashSet<>());
                cSet.add(k);
                cMap.put(j, cSet);
            }
            rMap.put(i, rSet);
        }

        for (int i = 0; i < arr.length; i++) {
            final int k = arr[i];
            final List<Integer> indexes = map.get(k);
            final Integer r = indexes.get(0);
            final Integer c = indexes.get(1);

            rMap.get(r).remove(k);
            cMap.get(c).remove(k);

            final Set<Integer> rSet = rMap.get(r);
            final Set<Integer> cSet = cMap.get(c);

            if (rSet.isEmpty() || cSet.isEmpty()) {
                return i;
            }
        }

        return -1;
    }

}
