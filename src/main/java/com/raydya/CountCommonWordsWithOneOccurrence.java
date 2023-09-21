package com.raydya;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CountCommonWordsWithOneOccurrence {

    public int countWords(String[] words1, String[] words2) {
        final Map<String, Integer> h1 = new HashMap<>();
        final Map<String, Integer> h2 = new HashMap<>();
        for (final String s : words1) {
            h1.put(s, h1.getOrDefault(s, 0) + 1);
        }
        for (final String s : words2) {
            h2.put(s, h2.getOrDefault(s, 0) + 1);
        }

        int cnt = 0;
        for (final String s : h1.keySet()) {
            final Integer i1 = h1.get(s);
            final Integer i2 = h2.get(s);
            if (Objects.nonNull(i2) && i1 == 1 && Objects.equals(i1, i2)) {
                cnt++;
            }
        }

        return cnt;
    }

}
