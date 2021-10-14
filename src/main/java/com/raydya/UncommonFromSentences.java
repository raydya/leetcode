package com.raydya;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonFromSentences {
    public String[] uncommonFromSentences(String s1, String s2) {
        final Map<String, Integer> m1 = getMap(s1);
        final Map<String, Integer> m2 = getMap(s2);

        List<String> ret = new ArrayList<>();
        m1.forEach((k, v) -> {
            if (v == 1 && m2.get(k) == null) {
                ret.add(k);
            }
        });

        m2.forEach((k, v) -> {
            if (v == 1 && m1.get(k) == null) {
                ret.add(k);
            }
        });

        return ret.toArray(new String[]{});
    }

    private Map<String, Integer> getMap(String s) {
        Map<String, Integer> map = new HashMap<>();

        StringBuilder w = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            if (c == ' ') {
                map.put(w.toString(), map.getOrDefault(w.toString(), 0) + 1);
                w = new StringBuilder();
            } else {
                w.append(c);
            }
        }

        map.put(w.toString(), map.getOrDefault(w.toString(), 0) + 1);

        return map;
    }
}
