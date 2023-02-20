package com.raydya;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortArrayByIncreasingFrequency {

    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> h = new HashMap<>();
        for (final int num : nums) {
            h.put(num, h.getOrDefault(num, 0) + 1);
        }

        List<Integer> r = new ArrayList<>();
        for (final int num : nums) {
            r.add(num);
        }

        r.sort((a, b) -> {
            final int i = h.get(a) - h.get(b);
            if (i == 0) {
                return b - a;
            }
            return i;
        });

        int[] rt = new int[r.size()];

        for (int i = 0; i < r.size(); i++) {
            rt[i] = r.get(i);
        }

        return rt;
    }

}
