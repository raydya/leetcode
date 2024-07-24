package com.raydya;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RelocateMarbles {

    public List<Integer> relocateMarbles(int[] nums, int[] moveFrom, int[] moveTo) {
        final Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            final int num = nums[i];
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < moveFrom.length; i++) {
            final int from = moveFrom[i];
            final int to = moveTo[i];
            final Integer f = map.get(from);
            if (f != null && f > 0) {
                map.put(from, 0);
                map.put(to, map.getOrDefault(to, 0) + f);
            }
        }

        return map.keySet().stream().filter(k -> map.get(k) > 0).sorted().collect(Collectors.toList());
    }

}
