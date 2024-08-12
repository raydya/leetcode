package com.raydya;

import java.util.HashSet;
import java.util.Set;

public class MagicDictionary {

    private Set<String> dictionary;

    public MagicDictionary() {
        dictionary = new HashSet<>();
    }

    public void buildDict(String[] dict) {
        for (String word : dict) {
            dictionary.add(word);
        }
    }

    public boolean search(String searchWord) {
        char[] chars = searchWord.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char original = chars[i];

            for (char c = 'a'; c <= 'z'; c++) {
                if (c == original) {
                    continue;
                }

                chars[i] = c;
                String newWord = new String(chars);

                if (dictionary.contains(newWord)) {
                    return true;
                }
            }

            chars[i] = original;
        }

        return false;
    }
}
