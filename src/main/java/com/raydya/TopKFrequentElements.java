package com.raydya;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            final int n = nums[i];
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        final LinkedHashMap<Integer, Integer> linkedHashMap = map.entrySet().stream()
            .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
            .collect(
                Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                    (s1, s2) -> s1, LinkedHashMap::new)
            );


        final int[] res = new int[k];

        final AtomicInteger cnt = new AtomicInteger(0);
        linkedHashMap.entrySet().forEach(entry -> {
            final int i = cnt.getAndAdd(1);
            if (i < k) {
                res[i] = entry.getKey();
            }
        });

        return res;
    }
}
