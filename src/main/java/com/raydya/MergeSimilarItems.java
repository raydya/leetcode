package com.raydya;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MergeSimilarItems {

    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer, Integer> kv = new HashMap<>();

        for (final int[] item : items1) {
            kv.put(item[0], kv.getOrDefault(item[0], 0) + item[1]);
        }

        for (final int[] item : items2) {
            kv.put(item[0], kv.getOrDefault(item[0], 0) + item[1]);
        }

        return kv.entrySet().stream()
            .map(entry -> Arrays.asList(entry.getKey(), entry.getValue()))
            .sorted(Comparator.comparingInt(v -> v.get(0)))
            .collect(Collectors.toList());
    }

}
