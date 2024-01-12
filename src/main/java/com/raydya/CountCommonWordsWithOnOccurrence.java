package com.raydya;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountCommonWordsWithOnOccurrence {

    public int countWords(String[] words1, String[] words2) {
        final Map<String, Integer> m1 = new HashMap<>();
        final Map<String, Integer> m2 = new HashMap<>();

        for (int i = 0; i < words1.length; i++) {
            final String s = words1[i];
            m1.put(s, m1.getOrDefault(s, 0) + 1);
        }

        for (int i = 0; i < words2.length; i++) {
            final String s = words2[i];
            m2.put(s, m2.getOrDefault(s, 0) + 1);
        }

        int ret = 0;
        final Set<String> keys = m1.keySet();
        for (final String key : keys) {
            final Integer m = m1.get(key);
            final Integer n = m2.get(key);

            if (m != null && m == 1 && n != null && n == 1) {
                ret++;
            }
        }

        return ret;
    }

}
