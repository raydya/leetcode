package com.raydya;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>(arr.length);

        for (final int k : arr) {
            map.put(k, map.getOrDefault(k, 0) + 1);
        }

        Set<Integer> uo = new HashSet<>(map.values());
        return uo.size() == map.values().size();
    }
}
