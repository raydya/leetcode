package com.raydya;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DecodeTheMessage {

    public String decodeMessage(String key, String message) {
        final Map<Character, Character> m = new HashMap<>();
        int idx = 0;
        for (int i = 0; i < key.length(); i++) {
            final char c = key.charAt(i);
            if (c == ' ') {
                continue;
            }
            if (Objects.nonNull(m.get(c))) {
                continue;
            }
            final char v = (char) ('a' + idx);
            m.putIfAbsent(c, v);
            idx++;
        }

        final char[] chars = message.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            final char c = chars[i];
            if (c == ' ') {
                continue;
            }
            final Character nc = m.get(c);
            chars[i] = nc;
        }
        return String.valueOf(chars);
    }

}
