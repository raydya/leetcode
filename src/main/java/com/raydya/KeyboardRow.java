package com.raydya;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyboardRow {
    private Map<Character, Integer> map = new HashMap<Character, Integer>() {
        {
            put('e', 1);
            put('i', 1);
            put('o', 1);
            put('p', 1);
            put('q', 1);
            put('r', 1);
            put('t', 1);
            put('u', 1);
            put('w', 1);
            put('y', 1);
            put('a', 2);
            put('d', 2);
            put('f', 2);
            put('g', 2);
            put('h', 2);
            put('j', 2);
            put('k', 2);
            put('l', 2);
            put('s', 2);
            put('b', 3);
            put('c', 3);
            put('m', 3);
            put('n', 3);
            put('v', 3);
            put('x', 3);
            put('z', 3);
        }
    };

    public String[] findWords(String[] words) {
        List<String> ret = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            final String word = words[i].toLowerCase();
            final int r = map.get(word.charAt(0));
            boolean sameRow = true;

            for (int j = 1; j < word.length(); j++) {
                final char c = word.charAt(j);
                Integer tr = map.get(c);
                if (r != tr) {
                    sameRow = false;
                    break;
                }
            }

            if (sameRow) ret.add(words[i]);
        }

        return ret.toArray(new String[]{});
    }
}
