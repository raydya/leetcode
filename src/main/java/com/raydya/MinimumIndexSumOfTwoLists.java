package com.raydya;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumIndexSumOfTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            indexMap.put(list1[i], i);
        }

        int min = Integer.MAX_VALUE;
        Map<Integer, List<String>> map = new HashMap<>();
        for (int i = 0; i < list2.length; i++) {
            final String r = list2[i];
            final Integer k = indexMap.get(r);
            if (k == null) continue;
            final int sum = i + k;
            final List<String> l = map.getOrDefault(sum, new ArrayList<>());
            l.add(r);
            map.put(sum, l);
            min = Math.min(min, sum);
        }

        return map.get(min).toArray(new String[]{});
    }
}
