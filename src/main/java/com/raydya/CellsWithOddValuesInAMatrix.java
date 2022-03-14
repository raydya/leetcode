package com.raydya;

import java.util.HashMap;
import java.util.Map;

public class CellsWithOddValuesInAMatrix {

    public int oddCells(int m, int n, int[][] indices) {
        final int[][] holder = new int[m][n];

        Map<Integer, Integer> rowCnt = new HashMap<>();
        Map<Integer, Integer> columnCnt = new HashMap<>();

        for (final int[] j : indices) {
            rowCnt.put(j[0], rowCnt.getOrDefault(j[0], 0) + 1);
            columnCnt.put(j[1], columnCnt.getOrDefault(j[1], 0) + 1);
        }

        int ret = 0;

        for (int i = 0; i < holder.length; i++) {
            final int k = rowCnt.getOrDefault(i, 0) > 0 ? rowCnt.get(i) : 0;
            final int[] h = holder[i];
            for (int j = 0; j < h.length; j++) {
                h[j] += k;
                if (columnCnt.getOrDefault(j, 0) > 0) {
                    h[j] += columnCnt.get(j);
                }

                if (h[j] % 2 != 0) {
                    ret++;
                }
            }
        }

        return ret;
    }
}
