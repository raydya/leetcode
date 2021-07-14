package com.raydya;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class DegreeOfAnArray {
    public int findShortestSubArray(int[] nums) {
        int maxCount = 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            final int num = nums[i];
            final List<Integer> value = map.getOrDefault(num, new ArrayList<>());
            value.add(i);
            map.put(num, value);
            maxCount = Math.max(maxCount, value.size());
        }

        final int max = maxCount;
        final List<Map.Entry<Integer, List<Integer>>> a = map.entrySet().stream()
            .filter(entry -> {
                final int size = entry.getValue().size();
                return Objects.equals(max, size);
            }).collect(Collectors.toList());

        int ret = Integer.MAX_VALUE;
        for (final Map.Entry<Integer, List<Integer>> entry : a) {
            final List<Integer> value = entry.getValue();
            final Integer k = value.get(0);
            final Integer v = value.get(value.size() - 1);
            ret = Math.min(v - k + 1, ret);
        }

        return ret;
    }
}
