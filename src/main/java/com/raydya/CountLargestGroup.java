package com.raydya;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountLargestGroup {

    public int countLargestGroup(int n) {
        Map<Integer, List<Integer>> m = new HashMap<>();

        int max = 0;
        for (int i = 1; i <= n; i++) {
            final String k = String.valueOf(i);

            int s = 0;

            for (int j = 0; j < k.length(); j++) {
                final char c = k.charAt(j);
                final int x = c - '0';
                s += x;
            }
            final List<Integer> orDefault = m.getOrDefault(s, new ArrayList<>());
            orDefault.add(i);
            m.put(s, orDefault);

            max = Math.max(max, orDefault.size());
        }

        int t = 0;
        for (final List<Integer> value : m.values()) {
            if (value.size() == max) {
                t++;
            }
        }

        return t;
    }

}
