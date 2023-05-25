package com.raydya;

import java.util.HashMap;
import java.util.Map;

public class OddStringDifference {

    public String oddString(String[] words) {
        Map<String, Integer> m = new HashMap<>();
        Map<String, String> h = new HashMap<>();
        for (final String word : words) {
            final StringBuilder sb = new StringBuilder();
            for (int j = 0; j < word.length() - j; j++) {
                sb.append(word.charAt(j + 1) - word.charAt(j));
                sb.append('_');
            }
            final String s = sb.toString();
            m.put(s, m.getOrDefault(s, 0) + 1);
            h.put(word, s);
        }

        for (final String word : words) {
            final String s = h.get(word);
            final Integer k = m.get(s);
            if (k == 1) {
                return word;
            }
        }

        return null;
    }

}
