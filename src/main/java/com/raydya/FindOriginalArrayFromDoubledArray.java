package com.raydya;

import java.util.HashMap;
import java.util.Map;

public class FindOriginalArrayFromDoubledArray {

    public int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 != 0) {
            return new int[]{};
        }

        final Map<Integer, Integer> odd = new HashMap<>();
        final Map<Integer, Integer> even = new HashMap<>();

        for (int i = 0; i < changed.length; i++) {
            final int k = changed[i];
            if (k % 2 == 0) {
                even.put(k, even.getOrDefault(k, 0) + 1);
            } else {
                odd.put(k, odd.getOrDefault(k, 0) + 1);
            }
        }

        final int[] ret = new int[changed.length / 2];

        int j = 0;
        for (final Integer i : odd.keySet()) {
            final Integer v = odd.get(i);
            final int target = i * 2;
            if (even.getOrDefault(target, 0) < v) {
                return new int[]{};
            }
            even.put(target, even.get(target) - v);
            odd.put(i, 0);
            for (int k = 0; k < v; k++) {
                ret[j + k] = i;
            }
            j += v;
        }

        for (final Integer i : even.keySet().stream().sorted().toArray(Integer[]::new)) {
            final Integer v = even.get(i);
            if (v == 0) {
                continue;
            }

            if (i == 0) {
                for (int k = 0; k < v / 2; k++) {
                    ret[j + k] = 0;
                }
                j += v / 2;
                even.put(i, v % 2);
                continue;
            }

            final int target = i * 2;
            if (even.getOrDefault(target, 0) < v) {
                continue;
            }

            even.put(target, even.get(target) - v);
            even.put(i, 0);
            for (int k = 0; k < v; k++) {
                ret[j + k] = i;
            }
            j += v;
        }

        for (final Integer i : even.keySet()) {
            if (even.get(i) != 0) {
                return new int[]{};
            }
        }

        return ret;
    }
}
