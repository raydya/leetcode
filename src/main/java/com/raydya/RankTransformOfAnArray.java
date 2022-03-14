package com.raydya;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankTransformOfAnArray {

    public int[] arrayRankTransform(int[] arr) {
        final int[] t = arr.clone();
        Arrays.sort(t);

        final Map<Integer, Integer> rankMap = new HashMap<>();
        int c = 0;
        for (int i = 0; i < t.length; i++) {
            final int k = t[i];
            final Integer j = rankMap.getOrDefault(k, 0);
            if (j != 0) {
                c++;
            }
            rankMap.put(k, i - c + 1);
        }

        final int[] ret = new int[arr.length];

        for (int i = 0; i < ret.length; i++) {
            final Integer j = rankMap.get(arr[i]);
            ret[i] = j;
        }

        return ret;
    }
}
