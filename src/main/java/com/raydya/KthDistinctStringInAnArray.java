package com.raydya;

import java.util.HashMap;
import java.util.Map;

public class KthDistinctStringInAnArray {

    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (final String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int count = 0;
        for (final String s : arr) {
            final Integer c = map.get(s);
            if (c == 1) {
                count++;
                if (count == k) {
                    return s;
                }
            }
        }

        return "";
    }
}
