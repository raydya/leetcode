package com.raydya;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountTheNumberOfVowelStringsInRange {

    private static final Set<Character> VOWELS = new HashSet<>();

    public int vowelStrings(String[] words, int left, int right) {
        VOWELS.addAll(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        int count = 0;
        for (int i = left; i <= right; i++) {
            final String word = words[i];
            if (isVowelString(word)) {
                count++;
            }
        }

        return count;
    }

    private boolean isVowelString(String word) {
        final char f = word.charAt(0);
        final char e = word.charAt(word.length() - 1);

        if (VOWELS.contains(f) && VOWELS.contains(e)) {
            return true;
        }

        return false;
    }

}
