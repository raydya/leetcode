package com.raydya;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {

    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        final String[] words = paragraph.split("[!?',;.\\s]");

        final Set<String> ban = new HashSet<>(Arrays.asList(banned));

        Map<String, Integer> map = new HashMap<>();
        String w = "";
        int max = 0;
        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }
            final int cnt = map.getOrDefault(word, 0) + 1;
            map.put(word, cnt);
            if (cnt > max && !ban.contains(word)) {
                max = cnt;
                w = word;
            }
        }

        return w;
    }
}
