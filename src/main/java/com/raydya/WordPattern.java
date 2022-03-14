package com.raydya;

import java.util.HashMap;

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        final String[] words = s.split(" ");

        if (words.length != pattern.length()) {
            return false;
        }

        final HashMap<String, String> holder = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            final char c = pattern.charAt(i);

            final String word = words[i];

            final String key = String.valueOf(c);

            if (!holder.containsKey(key)) {
                if (holder.containsValue(word)) {
                    return false;
                }
                holder.put(key, word);
            } else {
                final String h = holder.get(key);
                if (!h.equals(word)) {
                    return false;
                }
            }
        }

        return true;
    }
}
