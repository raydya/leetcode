package com.raydya;

import java.util.HashMap;
import java.util.Map;

public class VerifyingAnAlienDictionary {
    private final Map<Character, Integer> orderMap = new HashMap<>();

    public boolean isAlienSorted(String[] words, String order) {
        for (int i = 0; i < order.length(); i++) {
            final char c = order.charAt(i);
            orderMap.put(c, i);
        }

        String s = words[0];

        for (int i = 1; i < words.length; i++) {
            final String w = words[i];
            final boolean sorted = isSorted(s, w);
            if (!sorted) return false;
            s = w;
        }

        return true;
    }

    private boolean isSorted(String pre, String word) {
        for (int i = 0; i < pre.length(); i++) {
            if (i >= word.length()) {
                return false;
            }
            final char c1 = pre.charAt(i);
            final char c2 = word.charAt(i);

            if (c1 == c2) continue;

            return orderMap.get(c1) < orderMap.get(c2);
        }

        return true;
    }
}
