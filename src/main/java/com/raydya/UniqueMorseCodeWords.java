package com.raydya;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {

    private static final String[] MORSE_CODE_TABLE = new String[]{".-", "-...", "-.-.", "-..", ".",
        "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-",
        ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> uniqueCodes = new HashSet<>();
        for (final String word : words) {
            final String code = t(word);
            uniqueCodes.add(code);
        }

        return uniqueCodes.size();
    }

    private String t(String word) {
        String ret = "";
        for (int i = 0; i < word.length(); i++) {
            final char c = word.charAt(i);
            final int k = c - 'a';
            final String s = MORSE_CODE_TABLE[k];
            ret += s;
        }
        return ret;
    }
}
