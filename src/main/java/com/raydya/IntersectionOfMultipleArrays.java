package com.raydya;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IntersectionOfMultipleArrays {

    public List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (final int[] num : nums) {
            for (final int i : num) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }

        return map.entrySet().stream()
            .filter(e -> e.getValue() == nums.length).map(Map.Entry::getKey)
            .sorted()
            .collect(Collectors.toList());
    }

}
