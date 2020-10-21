package com.raydya;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Character> map = new HashMap<>();

        final char[] as = new char[s.length()];
        final char[] at = new char[t.length()];

        for (int i = 0; i < s.length(); i++) {
            as[i] = s.charAt(i);
        }

        for (int i = 0; i < t.length(); i++) {
            at[i] = t.charAt(i);
        }

        for (int i = 0; i < as.length; i++) {
            final char ss = as[i];
            final char st = at[i];

            if (!map.containsKey(ss) && !map.containsValue(st)) {
                map.put(ss, st);
            }

            if (!map.containsKey(ss) && map.containsValue(st) || !map.get(ss).equals(st)) {
                return false;
            }
        }

        return true;
    }
}
