package com.raydya;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeRanks {

    public String[] findRelativeRanks(int[] score) {
        final int[] clone = score.clone();
        Arrays.sort(clone);

        Map<Integer, String> map = new HashMap<>();

        int rank = score.length;
        for (int i = 0; i < clone.length; i++) {
            final int c = clone[i];
            if (rank == 1) {
                map.put(c, "Gold Medal");
            } else if (rank == 2) {
                map.put(c, "Silver Medal");
            } else if (rank == 3) {
                map.put(c, "Bronze Medal");
            } else {
                map.put(c, String.valueOf(rank));
            }
            rank--;
        }

        final String[] ret = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            final int j = score[i];
            ret[i] = map.get(j);
        }

        return ret;
    }
}
