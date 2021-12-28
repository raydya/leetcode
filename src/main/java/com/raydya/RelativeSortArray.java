package com.raydya;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> wMap = new HashMap<>();

        for (int i = 0; i < arr2.length; i++) {
            final int k = arr2[i];
            wMap.put(k, i);
        }

        Map<Integer, Integer> vMap = new HashMap<>();

        int[] gap = new int[arr1.length];
        int gi = 0;
        for (final int k : arr1) {
            if (Objects.isNull(wMap.get(k))) {
                gap[gi] = k;
                gi++;
                continue;
            }
            vMap.put(k, vMap.getOrDefault(k, 0) + 1);
        }
        final int[] newGap = Arrays.copyOfRange(gap, 0, gi);
        Arrays.sort(newGap);

        int p = 0;
        final int[] ret = new int[arr1.length];

        for (final int k : arr2) {
            while (vMap.get(k) > 0) {
                ret[p] = k;
                vMap.put(k, vMap.get(k) - 1);
                p++;
            }
        }

        for (final int i : newGap) {
            ret[p] = i;
            p++;
        }

        return ret;
    }
}
