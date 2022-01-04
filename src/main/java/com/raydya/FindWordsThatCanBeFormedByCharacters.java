package com.raydya;

public class FindWordsThatCanBeFormedByCharacters {
    public int countCharacters(String[] words, String chars) {
        int t = 0;

        final int[] charMap = new int[26];
        for (int i = 0; i < chars.length(); i++) {
            final char c = chars.charAt(i);
            charMap[c - 'a']++;
        }

        for (final String word : words) {
            final int[] clone = charMap.clone();
            boolean mastered = true;
            for (int i = 0; i < word.length(); i++) {
                final char c = word.charAt(i);
                clone[c - 'a']--;
                if (clone[c - 'a'] < 0) {
                    mastered = false;
                    break;
                }
            }

            if (mastered) {
                t += word.length();
            }
        }

        return t;
    }
}
