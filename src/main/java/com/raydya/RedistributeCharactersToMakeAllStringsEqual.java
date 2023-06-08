package com.raydya;

public class RedistributeCharactersToMakeAllStringsEqual {

    public boolean makeEqual(String[] words) {
        if (words.length == 1) {
            return true;
        }

        final int[] alphabets = new int[26];

        for (final String word : words) {
            for (int j = 0; j < word.length(); j++) {
                final char c = word.charAt(j);
                alphabets[c - 'a'] += 1;
            }
        }

        for (final int ac : alphabets) {
            if (ac == 0) {
                continue;
            }

            final int i = ac % words.length;
            if (i != 0) {
                return false;
            }
        }

        return true;
    }

}
