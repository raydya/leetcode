package com.raydya;

public class ShortestCompletingWord {

    private static final int ALPHABET_LENGTH = 26;

    public String shortestCompletingWord(String licensePlate, String[] words) {
        final char[] licensePlateCharArray = licensePlate.toLowerCase().toCharArray();
        final int[] ts = new int[ALPHABET_LENGTH];

        for (final char c1 : licensePlateCharArray) {
            if (Character.isLetter(c1)) {
                final int i = c1 - 'a';
                ts[i] += 1;
            }
        }

        String shortestCompletingWord = "";
        int completingWordLength = Integer.MAX_VALUE;

        for (final String word : words) {
            if (word.length() < completingWordLength && isCompletingWord(ts, word.toCharArray())) {
                shortestCompletingWord = word;
                completingWordLength = word.length();
            }
        }

        return shortestCompletingWord;
    }

    private boolean isCompletingWord(int[] ts, char[] chars) {
        final int[] cs = new int[ALPHABET_LENGTH];
        for (final char aChar : chars) {
            final int i = aChar - 'a';
            cs[i] += 1;
        }

        for (int i = 0; i < ALPHABET_LENGTH; i++) {
            if (ts[i] > cs[i]) {
                return false;
            }
        }

        return true;
    }
}
